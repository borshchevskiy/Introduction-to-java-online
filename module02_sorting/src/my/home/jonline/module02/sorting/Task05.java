package my.home.jonline.module02.sorting;

/*
 * 5. Сортировка вставками. Дана последовательность чисел a1, a2, ..., an. Требуется переставить числа в порядке 
 * возрастания. Делается это следующим образом. Пусть a1, a2, ..., ai - упорядоченная последовательность, т. е. a1 < a2 < ...< ai
 * Берется следующее число ai+1 и вставляется в последовательность так, чтобы новая 
 * последовательность была тоже возрастающей. Процесс производится до тех пор, пока все элементы от i + 1 до n
 * не будут перебраны. Примечание. Место помещения очередного элемента в отсортированную часть производить 
 * с помощью двоичного поиска. Двоичный поиск оформить в виде отдельной функции.
 * 
 * 
 * 
 */
import java.util.Arrays;
import java.util.Random;

public class Task05 {

	public static int[] initArray() {
		int[] array;
		Random random;

		random = new Random();
		array = new int[random.nextInt(10) + 10];

		for (int i = 0; i < array.length; i++) {
			array[i] = random.nextInt(100);
		}

		System.out.println("Исходный массив:");
		System.out.println(Arrays.toString(array));

		return array;
	}

	public static int binarySearch(int[] array, int j, int currentValue) {
		/*
		 * Двоичным поиском ищем в отсортированной части индекс для вставки нашего
		 * текущего значения (current value) т.к. точного совпадения значения может не
		 * быть, поиск найдет ближайшее значение.
		 */
		int index;
		int low;
		int mid;
		int high;

		low = 0;
		mid = 0;
		high = j;
		index = 0;

		while (low <= high) {
			mid = low + ((high - low) / 2);
			index = mid;
			if (array[mid] < currentValue) {
				low = mid + 1;
			} else if (array[mid] > currentValue) {
				high = mid - 1;
			} else if (array[mid] == currentValue) {
				index = mid;
				break;
			}
		}

		return index;
	}

	public static void insertionSort(int[] array) {

		for (int i = 1; i < array.length; i++) {
			int currentValue = array[i];

			// находим index - индекс ближайшего значения к currentValue в отсортированной
			// части массива
			int index = binarySearch(array, i, currentValue);

			// сдвигаем вправо все элементы между currentValue (это элемент array[i]) и
			// найденным ближайшим к нему значением array[index]
			for (int j = i; j > index; j--) {
				array[j] = array[j - 1];
			}

			/*
			 * После сдвига элементов вправо у нас получается что array[index + 1] принимает
			 * значение array[index] далее мы сравниваем наше currentValue c array[index] и
			 * если оно больше, то ставим currentValue на index+1, если иначе, то ставим на
			 * index.
			 * 
			 * Например: Был массив [0,2,4,curretnValue], index = 1, array[index] = 2. После
			 * сдвига мы получили массив [0,2,2,4]. Если currentValue = 3, т.е. оно больше
			 * array[index], то ставим его на место [index + 1] и получаем [0,2,3,4], иначе,
			 * если, например, currentValue = 1, то ставим его на место [index] и получаем
			 * [0,1,2,4]
			 * 
			 * 
			 */

			if (currentValue > array[index]) {
				array[index + 1] = currentValue;
			} else {
				array[index] = currentValue;
			}

		}
		System.out.println();
		System.out.println("Отсортированный массив:");
		System.out.println(Arrays.toString(array));
	}

	public static void main(String[] args) {

		insertionSort(initArray());

	}

}
