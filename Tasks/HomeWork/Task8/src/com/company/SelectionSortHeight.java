package com.company;

public class SelectionSortHeight implements HumanSorter {
    private Human humans[];
    // private HumanComparator comparator;

    public SelectionSortHeight(Human humans[]/*, HumanComparator comparator*/) {
        this.humans = humans;}
        // this.comparator = comparator;

    public void sort(Human humans[]) {

        for (int i = 0; i < humans.length - 1; i++) {
            Human minHeightHuman = humans[i];
            int IndexMinHeightHuman = i;
            for (int j = i + 1; j < humans.length; j++) {
                Human b = humans[j];
                HumanComparator comparator = new HeightHumanComparator(minHeightHuman, b);//создаю реализацию AgeHumanComparator интерфейса HumanComparator
                int compareHumanAge = comparator.compare(minHeightHuman, b);// вызвала метод из AgeHumanComparator

                if (compareHumanAge == 1) {
                    minHeightHuman = humans[j];
                    IndexMinHeightHuman = j;
                }
            }
            if (i != IndexMinHeightHuman) {
                Human temp = humans[i];
                humans[i] = humans[IndexMinHeightHuman];
                humans[IndexMinHeightHuman] = temp;
            }
        }


    }
}

