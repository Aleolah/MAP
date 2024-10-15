public class Aufgabe4 {
    public void cheapestTastature(int[] tastatures)
    {
        int min = tastatures[0];
        for(int i=1;i<tastatures.length;i++)
            if (tastatures[i]<min)min=tastatures[i];
        System.out.println(min);

    }
    public void expensiveObject(int[] tastatures,int[] usb){
        int max = tastatures[0];
        for(int i=1;i<tastatures.length;i++)
            if (tastatures[i]>max)max=tastatures[i];
        for(int i=1;i<usb.length;i++)
            if (usb[i]>max)max=usb[i];

        System.out.println(max);
    }
    public void expensiveUsb(int[] usb,int buget){
        int max = 0;
        for(int i=1;i<usb.length;i++)
            if (usb[i]>max && usb[i]<=buget)max=usb[i];
        if (max == 0) System.out.println("There is none");
        else System.out.println(max);
    }
    public void maximBuget(int buget, int[] tastatures, int[] usb){
        int max = 0;
        int current;
        for(int i=0;i<tastatures.length;i++)
        {
            if (tastatures[i] < buget)
                for(int j=0;j<usb.length;j++) {
                    current=tastatures[i];
                    if (usb[j] + current <= buget) {
                        current += usb[j];
                        if (max < current) max = current;
                    }
                }
        }
        if (max == 0) System.out.println(-1);
        else System.out.println(max);
    }

}
