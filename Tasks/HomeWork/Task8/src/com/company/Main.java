package com.company;

public class Main {

    public static void main(String[] args) {
	Human humans [] = new Human[3];
	humans[0] = new Human("Sasha", 13, 40, 150);
	humans[1] = new Human("Masha", 20, 55, 170);
	humans[2] = new Human("Dasha", 5, 41, 80);


    //HumanComparator comparator = new AgeHumanComparator();
	HumanSorter selectionSortAge = new SelectionSort(humans);
	selectionSortAge.sort(humans);

        System.out.println("Сортировка по возрасту");

	    for (int i=0; i< humans.length; i++)
	    {
                System.out.print(humans[i].getName()+" "+humans[i].getAge());
            System.out.println();
	    }

	    HumanSorter selectionSortWeight = new SelectionSortWeight(humans);
	    selectionSortWeight.sort(humans);

        System.out.println("Сортировка по весу");

        for (int i=0; i< humans.length; i++)
        {
            System.out.print(humans[i].getName()+" "+humans[i].getWeight());
            System.out.println();
        }

        HumanSorter selectionSortHeight = new SelectionSortHeight(humans);
        selectionSortHeight.sort(humans);

        System.out.println("Сортировка по росту");

        for (int i=0; i< humans.length; i++)
        {
            System.out.print(humans[i].getName()+" "+humans[i].getHeight());
            System.out.println();
        }


    }
}
