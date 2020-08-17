package Components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("tvComponent")
public class TV {

    @Autowired
    private List<Channel> tvChannels;

    public TV(List<Channel> channelList) {
        this.tvChannels = channelList;
    }

    public void loadAllChannels() {
        int count=1;
        for(Channel channel: tvChannels){
            System.out.println("#"+count+" "+channel.loadChannel());
            count++;
        }
    }

    public void playSpecificChannel(int number){
        if(number>tvChannels.size()+1 || number<=0){
            System.out.println("Invalid channel number");
        }else{
        System.out.println(tvChannels.get(number-1).loadChannel()+" is playing!");
        }
    }
}
