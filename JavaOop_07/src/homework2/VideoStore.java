package homework2;

public class VideoStore {
    private Video[] videos = new Video[10];
    private int count;  //统计添加的次数

    /**
     * 添加一个新的电影
     * 通过电影的名称创建一个video对象，将对象保存在数组中
     *
     * @param name 电影的名称
     */
    public void addVideo(String name) {
        Video video = new Video();
        video.setName(name);
        video.setRent(false);//表示没有借出去
        videos[count++]=video;
    }

    /**
     * 根据片名借出电影
     *
     * @return 成功借出电影，返回true,如果片名不存在，则返回false
     */
    public boolean checkOut(String videoName) {
        //TODO
        for (int i = 0; i < count; i++) {
            if(videos[i].getName().equals(videoName)){
                videos[i].setRent(true);//表示借出
                return  true;
            }
        }
        return false;
    }
    /**
     * 归还电影
     *
     * @return 成功归还电影，返回true,如果片名不存在，则返回false
     */
    public boolean returnVideo(String videoName) {
        //TODO  应该有问题
        Video videoByName = findVideoByName(videoName);
        if(videoByName!=null){
            videoByName.setRent(false);
            return true;
        }

        return false;
    }

    /**
     * 根据 电影名称查询电影
     *
     * @param videoName
     * @return 匹配到的电影，如果找不到对应名称的电影，返回null
     */
    private Video findVideoByName(String videoName) {
        //TODO
        for (int i = 0; i < count; i++) {
            if (videos[i].getName().equals(videoName)) {
                return videos[i];
            }
        }
        return null;
    }

    /**
     * 设置用户对电影的评分(1~5)，收到评分之后，计算该电影的平均评分，
     */
    public void receiveRating(String videoName, int mark) {
        //TODO
        for (int i = 0; i < count; i++) {
            if(videoName.equals(videos[i].getName()) && videos[i].isRent() == false){
                   videos[i].setMark(mark);
                   return;
            }
        }
    }

    /**
     * 显示所有的数据
     */
    public void listInventory() {
        //TODO
        for (int i = 0; i < count; i++) {
            System.out.println(videos[i].toString());
        }
    }

    public static void main(String[] args) {
        VideoStore videoStore = new VideoStore();
        videoStore.addVideo("黑客帝国");
        videoStore.addVideo("教父");
        videoStore.addVideo("沉默的羔羊");
        videoStore.listInventory();
        System.out.println();
        videoStore.checkOut("教父");

        System.out.println();
        videoStore.returnVideo("教父");

        videoStore.receiveRating("教父",5);

        videoStore.checkOut("教父");
        videoStore.returnVideo("教父");
        videoStore.receiveRating("教父",3);
        videoStore.listInventory();




    }




}
