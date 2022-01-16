package com.nasir.traveler;

public class MergeSortTraveler {

	void merge(int arr[],int left,int mid, int right) {
		// TODO Auto-generated method stub
		int n1=mid-left+1;
		int n2=right-mid;
		
		// Temp Array
		int leftArray[]=new int[n1];
		int rightArray[]=new int[n2];
		
		//Copy the data to Temp Array
		for(int i=0;i<n1;i++)
			leftArray[i]=arr[left+i];
		for(int j=0;j<n2;j++)
			rightArray[j]=arr[mid+1+j];
		// Arrays merge
		int i=0;int j=0;
		int k = left;
		while(i<n1 && j<n2) {
			if( leftArray[i] >= rightArray[j]) {
				arr[k]=leftArray[i];
				i++;
			} else {
				arr[k]= rightArray[j];
				j++;
			}   
			k++;
		}	
		while(i<n1) {
			arr[k]=leftArray[i];
			i++;
			k++;
		}
		// copy remaining elements of right array
		while(j <n2) {
			arr[k] = rightArray[j];
			j++;
			k++;
		}
	}
		// Sorting of Arrays
		public void sort(int[] bnotes,int left, int right) {
			if(left < right) {
				int mid = (left + right) / 2;
			// Sort L and R halves
			sort(bnotes, left, mid);
			sort(bnotes, mid + 1, right);
			// Merge L and R
			merge(bnotes, left, mid, right);
			}
		}
}
