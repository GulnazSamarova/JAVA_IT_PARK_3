package com.company;

public class SelectionSort implements HumanSorter {
    private Human humans[];
   // private HumanComparator comparator;

    public SelectionSort (Human humans[]/*, HumanComparator comparator*/){
        this.humans = humans;
       // this.comparator = comparator;
    }



    public void sort(/*HumanComparator comparator,*/ Human humans[]) {

        for (int i = 0; i < humans.length - 1; i++) {
            Human minAgeHuman = humans[i];
            int IndexMinAgeHuman = i;
            for (int j = i + 1; j < humans.length; j++) {
                Human b = humans[j];
                HumanComparator comparator = new AgeHumanComparator(minAgeHuman, b);//создаю реализацию AgeHumanComparator интерфейса HumanComparator
                int compareHumanAge = comparator.compare(minAgeHuman, b);// вызвала метод из AgeHumanComparator

                if (compareHumanAge == 1) {
                    minAgeHuman = humans[j];
                    IndexMinAgeHuman = j;
                }
            }
            if (i != IndexMinAgeHuman) {
                Human temp = humans[i];
                humans[i] = humans[IndexMinAgeHuman];
                humans[IndexMinAgeHuman] = temp;
            }
        }



    }


  /*  public void sortWeight (HumanComparator comparator, Human humans[]){

        for (int i= 0; i < humans.length-1; i++) {
            Human minWeightHuman = humans [i];
            int IndexMinWeightHuman = i;
            for (int j = i+1; j< humans.length; j++) {
                Human b = humans[j];
                comparator = new WeightHumanComparator(minWeightHuman, b);//создаю реализацию AgeHumanComparator интерфейса HumanComparator
                int compareHumanAge = comparator.compare(minWeightHuman, b);// вызвала метод из AgeHumanComparator

                if (compareHumanAge == 1) {
                    minWeightHuman = humans[j];
                    IndexMinWeightHuman = j;
                }
            }
            if (i != IndexMinWeightHuman){
                Human temp = humans[i];
                humans[i] = humans[IndexMinWeightHuman];
                humans [IndexMinWeightHuman] = temp;
            }
        }


    }

    public void sortHeight (HumanComparator comparator, Human humans[]){

        for (int i= 0; i < humans.length-1; i++) {
            Human minHeightHuman = humans [i];
            int IndexMinHeightHuman = i;
            for (int j = i+1; j< humans.length; j++) {
                Human b = humans[j];
                comparator = new HeightHumanComparator(minHeightHuman, b);//создаю реализацию AgeHumanComparator интерфейса HumanComparator
                int compareHumanAge = comparator.compare(minHeightHuman, b);// вызвала метод из AgeHumanComparator

                if (compareHumanAge == 1) {
                    minHeightHuman = humans[j];
                    IndexMinHeightHuman = j;
                }
            }
            if (i != IndexMinHeightHuman){
                Human temp = humans[i];
                humans[i] = humans[IndexMinHeightHuman];
                humans [IndexMinHeightHuman] = temp;
            }
        }


    }*/
}
