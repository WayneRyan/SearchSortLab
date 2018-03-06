

public class RationalRunner {

	public static void main(String[] args) {
		/*  
		System.out.println("Binary Search Data");
		RationalNumber[] allRats = new RationalNumber[10000000];
		for(int i=0 ; i<allRats.length ; i++)allRats[i] = new RationalNumber();
		System.out.println("start sorting");
		RationalUtils.mergeSort(allRats);
		System.out.println("done sorting");
		for(int size=1000000 ; size<allRats.length ; size+=20000){
			RationalNumber[] myRats = new RationalNumber[size];
			RationalNumber[] searchItems = new RationalNumber[100000];
			for (int i = 0; i < myRats.length; i++) myRats[i] = allRats[i];
			for (int i = 0; i < searchItems.length; i++) searchItems[i] = myRats[(int)(Math.random()*myRats.length)];
			long start = System.nanoTime();
			for(int i=0 ; i<searchItems.length ; i++){
				RationalUtils.binarySearch(myRats,searchItems[i]);
			}
			long stop = System.nanoTime();
			System.out.println(size + "\t" + (stop - start)/1000000000.0);
		}
		/**/
		/*
		System.out.println("Sequential Search Data");
		for(int size=10000 ; size<100000 ; size+=200){
			RationalNumber[] myRats = new RationalNumber[size];
			RationalNumber[] searchItems = new RationalNumber[1000];
			for (int i = 0; i < myRats.length; i++) myRats[i] = new RationalNumber();
			for (int i = 0; i < searchItems.length; i++) searchItems[i] = myRats[(int)(Math.random()*myRats.length)];
			long start = System.nanoTime();
			for(int i=0 ; i<searchItems.length ; i++){
				RationalUtils.sequentialSearch(myRats,searchItems[i]);
			}
			long stop = System.nanoTime();
			System.out.println(size + "\t" + (stop - start)/1000000000.0);
		}
		
		/**/
		/*
		System.out.println("MergeSort Data");
		for(int size=100000 ; size<1000000 ; size+=2000){
			RationalNumber[] myRats = new RationalNumber[size];
			for (int i = 0; i < myRats.length; i++) myRats[i] = new RationalNumber();
			long start = System.nanoTime();
			RationalUtils.mergeSort(myRats);
			long stop = System.nanoTime();
			System.out.println(size + "\t" + (stop - start)/1000000000.0);
		}
		
		/**/
		/*
		System.out.println("SelectionSort Data");
		for(int size=2000 ; size<20000 ; size+=40){
			RationalNumber[] myRats = new RationalNumber[size];
			for (int i = 0; i < myRats.length; i++) myRats[i] = new RationalNumber();
			long start = System.nanoTime();
			RationalUtils.selectionSort(myRats);
			long stop = System.nanoTime();
			System.out.println(size + "\t" + (stop - start)/1000000000.0);
		}
		
		/**/
		/*
		System.out.println("InsertionSort Data");
		for(int size=2000 ; size<20000 ; size+=40){
			RationalNumber[] myRats = new RationalNumber[size];
			for (int i = 0; i < myRats.length; i++) myRats[i] = new RationalNumber();
			long start = System.nanoTime();
			RationalUtils.insertionSort(myRats);
			long stop = System.nanoTime();
			System.out.println(size + "\t" + (stop - start)/1000000000.0);
		}
		
		/**/

	}


}
