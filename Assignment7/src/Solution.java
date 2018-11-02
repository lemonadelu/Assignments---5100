import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class Solution {
   static class Interval {
        private int start;
        private int end;

        public Interval() {
            start = 0;
            end = 0;
        }

        public Interval(int s, int e) {
            this.start = s;
            this.end = e;
        }

       @Override
       public String toString() {
           return "start : " + start + " end: " + end;
       }
   }

    public List<Interval> merge(List<Interval> intervals) {
        if (intervals.size() == 0 || intervals.size() == 1) {
            return intervals;
        }
        //sort start and end
        int n = intervals.size();
        int starts[] = new int[n];
        int ends[] = new int[n];
        for (int i = 0; i < n; i++) {
            starts[i] = intervals.get(i).start;
            ends[i] = intervals.get(i).end;
        }
        Arrays.sort(starts);
        Arrays.sort(ends);

        List<Interval> merge = new ArrayList<Interval>();
        for (int i = 0, j = 0; i < n; i++) {
            //if the end of first interval is bigger than the start of the second interval
            if (i == n - 1 || starts[i + 1] < ends[i]) {
                merge.add(new Interval(starts[j], ends[i]));
                j = i + 1;
            }
        }
        System.out.print(Arrays.toString(merge.toArray()));
        return merge;
    }

    public static void main(String[] args) {
        //Solution s = new Solution();
        List<Interval> intervals = new ArrayList<Interval>();
        intervals.add(new Interval(1,3));
        intervals.add(new Interval(2,4));
        intervals.add(new Interval(5,7));
        intervals.add(new Interval(6,8));

        new Solution().merge(intervals);
    }

    /**
     * 2. parse file
     */
    public static void parse(File file) throws IOException {
        RandomAccessFile input = null;
        String line = null;
        try {
            input = new RandomAccessFile(file, "r");
            while ((line = input.readLine()) != null) {
                System.out.println(line);
            }
            return;
        } finally {
            if (input != null) {
                input.close();
            }
        }
    }
}