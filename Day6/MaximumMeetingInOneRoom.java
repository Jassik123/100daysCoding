package start;
import java.util.*;
public class MaximumMeetingInOneRoom {

        private static class Meeting{
            Integer Starttime;
            Integer FInishtime;
            Integer MeetingNumber;

            public String toString() {
                return Starttime + " " + FInishtime;
            }
        }
private static class MeetingComparator implements Comparator<Meeting>{
            public int compare(Meeting m1,Meeting m2){
                if(m1.FInishtime>m2.FInishtime) return 1;
                else if(m1.FInishtime<m2.FInishtime) return -1;
                else return 0;


            }
    }

        public static void main(String[] args) {
            List<Integer> start= List.of(1,3,0,5,8,5);
            List<Integer> finish=List.of(2,4,6,7,8,9,9);
            List<Meeting> meetings=new ArrayList<>();
            for(int i=0;i<start.size();i++){
                Meeting meeting=new Meeting();
                meeting.Starttime= start.get(i);
                meeting.FInishtime= finish.get(i);
                meeting.MeetingNumber=i+1;
                meetings.add(meeting);

            }
            meetings.sort(new MeetingComparator());
            List<Integer> result=new ArrayList<>();
            result.add(meetings.get(0).MeetingNumber);
            Meeting prevmeeting=meetings.get(0);
            for(int i=0;i<meetings.size();i++){
                Meeting currMeeting=meetings.get(i);
                if(currMeeting.Starttime> prevmeeting.FInishtime){
                    result.add(currMeeting.MeetingNumber);
                    prevmeeting=currMeeting;
                }

            }
            System.out.println(meetings);
            System.out.println(result);

    }
}
