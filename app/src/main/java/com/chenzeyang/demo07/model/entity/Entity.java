package com.chenzeyang.demo07.model.entity;

import java.util.List;

/**
 * ----------------Dragon be here!------------------
 * 　   　　┏┓　　　┏┓
 * 　   　┏┛┻━━━┛┻┓
 * 　   　┃　　　　　　　┃
 * 　   　┃　　　━　　　┃
 * 　   　┃　┳┛　┗┳　┃
 * 　   　┃　　　　　　　┃
 * 　   　┃　　　┻　　　┃
 * 　   　┃　　　　　　　┃
 * 　   　┗━┓　　　┏━┛
 * 　   　　　┃　　　┃神兽保佑
 * 　   　　　┃　　　┃代码无BUG！
 * 　   　　　┃　　　┗━━━┓
 * 　   　　　┃　神兽出品　　┣┓
 * 　   　　　┃　必属精品　　┏┛
 * 　   　　　┗┓┓┏━┳┓┏┛
 * 　   　　　　┃┫┫　┃┫┫
 * 　   　　　　┗┻┛　┗┻┛
 * ━━━━━━━━神兽出没━━━━━━━━
 * <p>
 * Created by Mr Chen on 2017/9/15 0015 下午 2:26.
 */

public class Entity {

    /**
     * reason : 成功的返回
     * result : {"stat":"1","data":[{"uniquekey":"de66e3c7af85e1e749cc0778888f669e","title":"小学保安的请假条惊艳朋友圈 他曾当过十年村支书","date":"2017-09-15 13:20","category":"头条","author_name":"都市快报","url":"http://mini.eastday.com/mobile/170915132036727.html","thumbnail_pic_s":"http://01.imgmini.eastday.com/mobile/20170915/20170915132036_08300bca4da2693e41c49f5ec44de119_4_mwpm_03200403.jpg","thumbnail_pic_s02":"http://01.imgmini.eastday.com/mobile/20170915/20170915132036_08300bca4da2693e41c49f5ec44de119_1_mwpm_03200403.jpg","thumbnail_pic_s03":"http://01.imgmini.eastday.com/mobile/20170915/20170915132036_08300bca4da2693e41c49f5ec44de119_2_mwpm_03200403.jpg"},{"uniquekey":"24d3475226789ee8166a507afadcc3eb","title":"韩国庆北星州将新建高尔夫球场 因原球场被\u201c萨德\u201d占用","date":"2017-09-15 13:51","category":"头条","author_name":"环球网","url":"http://mini.eastday.com/mobile/170915135101925.html","thumbnail_pic_s":"http://09.imgmini.eastday.com/mobile/20170915/20170915135101_656e20ae0e8b0948a65734c423391083_1_mwpm_03200403.jpg"},{"uniquekey":"fb4698a8525bf08d7de4297a5b3f3c4f","title":"委内瑞拉推\u201c兔子计划\u201d缓解粮食危机：这不是宠物，是5斤肉","date":"2017-09-15 13:46","category":"头条","author_name":"澎湃新闻网","url":"http://mini.eastday.com/mobile/170915134641989.html","thumbnail_pic_s":"http://01.imgmini.eastday.com/mobile/20170915/20170915134641_a5672bd90b69e7c42043d6922f6da5b3_1_mwpm_03200403.jpg"},{"uniquekey":"f9d6e5f8bcb75ac53a76630e8b0524d2","title":"玉磨铁路\u201c9.14\u201d隧道塌方追踪：9名被困者生命体征平稳","date":"2017-09-15 13:37","category":"头条","author_name":"中国新闻网","url":"http://mini.eastday.com/mobile/170915133721728.html","thumbnail_pic_s":"http://09.imgmini.eastday.com/mobile/20170915/20170915133721_b5c27a8e13b2e8889a3cc2f6077e004a_2_mwpm_03200403.jpg","thumbnail_pic_s02":"http://09.imgmini.eastday.com/mobile/20170915/20170915133721_b5c27a8e13b2e8889a3cc2f6077e004a_1_mwpm_03200403.jpg"},{"uniquekey":"3c75305c0ef3e9b19b6b6d66a36eae17","title":"老红军、云南省人大原副主任颜义泉逝世，1934年参加长征","date":"2017-09-15 13:20","category":"头条","author_name":"云南网","url":"http://mini.eastday.com/mobile/170915132006033.html","thumbnail_pic_s":"http://08.imgmini.eastday.com/mobile/20170915/20170915132006_1270ff4ca1c1b47034dcc5f7be98724e_1_mwpm_03200403.jpg"},{"uniquekey":"145212b2b3c057186736548742795e5a","title":"西双版纳隧道坍塌被困9人确认存活，已用小管子打通塌方体","date":"2017-09-15 13:14","category":"头条","author_name":"新华社","url":"http://mini.eastday.com/mobile/170915131427310.html","thumbnail_pic_s":"http://09.imgmini.eastday.com/mobile/20170915/20170915131427_9bfccfc0656d4ce0cad33f0fd317cc68_1_mwpm_03200403.jpg"},{"uniquekey":"674bc1fe90bc3758d293d3f742570d49","title":"俄专家：为提高投票率，政府需为普京寻找明年大选的竞争对手","date":"2017-09-15 13:14","category":"头条","author_name":"澎湃新闻网","url":"http://mini.eastday.com/mobile/170915131426776.html","thumbnail_pic_s":"http://04.imgmini.eastday.com/mobile/20170915/20170915131426_eee3a99e754e1ee068c278186733c968_1_mwpm_03200403.jpg"},{"uniquekey":"effd6d207fca5577194b50ba0bbd960e","title":"美国演艺圈好闺蜜：演员捐肾给歌手","date":"2017-09-15 13:00","category":"头条","author_name":"环球时报","url":"http://mini.eastday.com/mobile/170915130018264.html","thumbnail_pic_s":"http://06.imgmini.eastday.com/mobile/20170915/20170915130018_f884e0d657debee709e8827e5d177317_1_mwpm_03200403.jpg"},{"uniquekey":"2ea06b4fc2c4b26224b2f4709af61dfc","title":"频现神秘\u201c诈弹\u201d威胁 俄安全部门\u201c忙坏了\u201d","date":"2017-09-15 13:00","category":"头条","author_name":"新华网","url":"http://mini.eastday.com/mobile/170915130018158.html","thumbnail_pic_s":"http://04.imgmini.eastday.com/mobile/20170915/20170915130018_ad7e52042db4ca67a47b35cf654e7af9_2_mwpm_03200403.jpg","thumbnail_pic_s02":"http://04.imgmini.eastday.com/mobile/20170915/20170915130018_ad7e52042db4ca67a47b35cf654e7af9_3_mwpm_03200403.jpg","thumbnail_pic_s03":"http://04.imgmini.eastday.com/mobile/20170915/20170915130018_ad7e52042db4ca67a47b35cf654e7af9_4_mwpm_03200403.jpg"},{"uniquekey":"9c6f24c42fb173d5b6c0eb4853427a71","title":"女子野外好心喂食小狐狸，不料却出现这样令人尴尬一幕！","date":"2017-09-15 12:46","category":"头条","author_name":"斯文笔子","url":"http://mini.eastday.com/mobile/170915124654276.html","thumbnail_pic_s":"http://07.imgmini.eastday.com/mobile/20170915/20170915_62e0aafcfb36849ec47eafaaf74c521f_cover_mwpm_03200403.jpg","thumbnail_pic_s02":"http://07.imgmini.eastday.com/mobile/20170915/20170915_226c3f4874ee405c00f132a939f4574b_cover_mwpm_03200403.jpg","thumbnail_pic_s03":"http://07.imgmini.eastday.com/mobile/20170915/20170915_e75ee453b9740d8349a57f62f2faeeff_cover_mwpm_03200403.jpg"},{"uniquekey":"5ec7ca3808a4c228a8771a03e1199e2f","title":"定了，雄安用人薪酬参照北京！你让河北人民怎么办？","date":"2017-09-15 12:45","category":"头条","author_name":"彩贝财经","url":"http://mini.eastday.com/mobile/170915124531359.html","thumbnail_pic_s":"http://06.imgmini.eastday.com/mobile/20170915/20170915124531_e53015b31ddf5f51e25aaf888c3edfc2_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://06.imgmini.eastday.com/mobile/20170915/20170915124531_e53015b31ddf5f51e25aaf888c3edfc2_2_mwpm_03200403.jpg","thumbnail_pic_s03":"http://06.imgmini.eastday.com/mobile/20170915/20170915124531_e53015b31ddf5f51e25aaf888c3edfc2_3_mwpm_03200403.jpg"},{"uniquekey":"d66b59f1057cb4fc47b08f814293e211","title":"9月底迎好运，未来得贵人相助，连连发财的3大生肖！","date":"2017-09-15 12:44","category":"头条","author_name":"吉名轩八字星座","url":"http://mini.eastday.com/mobile/170915124418382.html","thumbnail_pic_s":"http://07.imgmini.eastday.com/mobile/20170915/20170915_573cb141cf6ccc4aa2ebade931fa85a6_cover_mwpm_03200403.jpg","thumbnail_pic_s02":"http://07.imgmini.eastday.com/mobile/20170915/20170915_e49d3d676b6dba1dcb379b7e1d90edfa_cover_mwpm_03200403.jpg","thumbnail_pic_s03":"http://07.imgmini.eastday.com/mobile/20170915/20170915_5c4f6db51de3a33bc73f0605f62f944a_cover_mwpm_03200403.jpg"},{"uniquekey":"db2c6ac26be3c4bef768b9d5ebd224f6","title":"男童骑小黄车身亡案庭审：ofo称他违规使用损害财产","date":"2017-09-15 12:32","category":"头条","author_name":"澎湃新闻网","url":"http://mini.eastday.com/mobile/170915123259024.html","thumbnail_pic_s":"http://05.imgmini.eastday.com/mobile/20170915/20170915123259_d41d8cd98f00b204e9800998ecf8427e_1_mwpm_03200403.jpg"},{"uniquekey":"cb3fd6fcbd45afcee1f3717524c2cd15","title":"为何越南将重炮瞄准解放军,中国却毫不在意?答案让人腰杆挺得直","date":"2017-09-15 12:32","category":"头条","author_name":"军迷亮点","url":"http://mini.eastday.com/mobile/170915123234505.html","thumbnail_pic_s":"http://02.imgmini.eastday.com/mobile/20170915/20170915_29ffa8570204cf8dbd2e1570fef47d32_cover_mwpm_03200403.jpg","thumbnail_pic_s02":"http://02.imgmini.eastday.com/mobile/20170915/20170915_df2dd34d088f93368f1d1f6fca114f05_cover_mwpm_03200403.jpg","thumbnail_pic_s03":"http://02.imgmini.eastday.com/mobile/20170915/20170915_65102ee9f4ff6d881449d2188ed41cf3_cover_mwpm_03200403.jpg"},{"uniquekey":"283b11fdba1eef664d2cd454b2dcb1ae","title":"最新研究：中国内陆沙尘污染的真正根源是戈壁荒漠","date":"2017-09-15 12:19","category":"头条","author_name":"环球网","url":"http://mini.eastday.com/mobile/170915121938743.html","thumbnail_pic_s":"http://04.imgmini.eastday.com/mobile/20170915/20170915121938_9c117eb08f9af1db7bd9106fabf7e597_1_mwpm_03200403.jpg"},{"uniquekey":"a8effb9547f0f29c6238ce6f2ee50f9e","title":"一对小夫妻中午退房后，保洁阿姨进门看到这一幕都不敢进去打扫了","date":"2017-09-15 12:15","category":"头条","author_name":"奇趣有话说","url":"http://mini.eastday.com/mobile/170915121552796.html","thumbnail_pic_s":"http://08.imgmini.eastday.com/mobile/20170915/20170915_54d29334da387419eb4f341ab4a071a1_cover_mwpm_03200403.jpg","thumbnail_pic_s02":"http://08.imgmini.eastday.com/mobile/20170915/20170915_34951490b023184f580beea05ed7fc53_cover_mwpm_03200403.jpg","thumbnail_pic_s03":"http://08.imgmini.eastday.com/mobile/20170915/20170915_98668257239e145bbf2a0637b7da84d9_cover_mwpm_03200403.jpg"},{"uniquekey":"f673466907f9c1eea1cfdc9ac2c70764","title":"中国突然宣布抢占全球人工智能制高点，打响\"芯片\u201c收购战，特朗普不乐意了！","date":"2017-09-15 12:13","category":"头条","author_name":"搜狐","url":"http://mini.eastday.com/mobile/170915121347001.html","thumbnail_pic_s":"http://09.imgmini.eastday.com/mobile/20170915/20170915121347_cc27140fcd96542d164e8c897d94ee4f_3_mwpm_03200403.jpg","thumbnail_pic_s02":"http://09.imgmini.eastday.com/mobile/20170915/20170915121347_cc27140fcd96542d164e8c897d94ee4f_2_mwpm_03200403.jpg","thumbnail_pic_s03":"http://09.imgmini.eastday.com/mobile/20170915/20170915121347_cc27140fcd96542d164e8c897d94ee4f_4_mwpm_03200403.jpg"},{"uniquekey":"d2b7cad708a055a47fdddce12cd6800c","title":"湖南道县32岁退伍军人下水清堵溺亡，上千群众自发为其送行","date":"2017-09-15 11:56","category":"头条","author_name":"法制晚报·看法新闻","url":"http://mini.eastday.com/mobile/170915115607465.html","thumbnail_pic_s":"http://03.imgmini.eastday.com/mobile/20170915/20170915115607_72b3aa1fae8d3e52964f6b335d66f0d4_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://03.imgmini.eastday.com/mobile/20170915/20170915115607_72b3aa1fae8d3e52964f6b335d66f0d4_2_mwpm_03200403.jpg","thumbnail_pic_s03":"http://03.imgmini.eastday.com/mobile/20170915/20170915115607_72b3aa1fae8d3e52964f6b335d66f0d4_3_mwpm_03200403.jpg"},{"uniquekey":"6f16d0f03e8d3d36533084c671d94c68","title":"乐天准备\u201c挟起皮包走路\u201d，很好很好，不送","date":"2017-09-15 11:48","category":"头条","author_name":"火星方阵","url":"http://mini.eastday.com/mobile/170915114855616.html","thumbnail_pic_s":"http://02.imgmini.eastday.com/mobile/20170915/20170915_a477f4980558c20975a00e8638b03231_mwpm_03200403.jpg"},{"uniquekey":"f6ddec9db16da75a989b4c253b305027","title":"中国四大奇人，加起来活到1199岁，皇帝一波接一波，他们依然健在","date":"2017-09-15 11:45","category":"头条","author_name":"废池乔木","url":"http://mini.eastday.com/mobile/170915114523238.html","thumbnail_pic_s":"http://04.imgmini.eastday.com/mobile/20170915/20170915_607559dc29fe3fa5f6e574b69c063c7b_mwpm_03200403.jpg","thumbnail_pic_s02":"http://04.imgmini.eastday.com/mobile/20170915/20170915_81ea487de64c4ee2c9e72a7277a78512_cover_mwpm_03200403.jpg","thumbnail_pic_s03":"http://04.imgmini.eastday.com/mobile/20170915/20170915_34b9631842624bbb3609260cd471a6f5_cover_mwpm_03200403.jpg"},{"uniquekey":"21e446888552d5f6cac8a60b2287ebba","title":"上海辰山植物园纠错人民日报：配图里的30余种植物名称有误","date":"2017-09-15 11:41","category":"头条","author_name":"澎湃新闻网","url":"http://mini.eastday.com/mobile/170915114152231.html","thumbnail_pic_s":"http://01.imgmini.eastday.com/mobile/20170915/20170915114152_5975e501dd78a56963c9108fdcf757a4_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://01.imgmini.eastday.com/mobile/20170915/20170915114152_5975e501dd78a56963c9108fdcf757a4_9_mwpm_03200403.jpg","thumbnail_pic_s03":"http://01.imgmini.eastday.com/mobile/20170915/20170915114152_5975e501dd78a56963c9108fdcf757a4_5_mwpm_03200403.jpg"},{"uniquekey":"2e5edc911907af8e6181559e36af4f1e","title":"2017年的猪肉越来越难吃了，专家：真怨不得养猪人","date":"2017-09-15 11:41","category":"头条","author_name":"农村老林","url":"http://mini.eastday.com/mobile/170915114133258.html","thumbnail_pic_s":"http://02.imgmini.eastday.com/mobile/20170915/20170915114133_6dcae72e0627a5d5d73b9f5b8356a622_2_mwpm_03200403.jpg","thumbnail_pic_s02":"http://02.imgmini.eastday.com/mobile/20170915/20170915114133_6dcae72e0627a5d5d73b9f5b8356a622_1_mwpm_03200403.jpg","thumbnail_pic_s03":"http://02.imgmini.eastday.com/mobile/20170915/20170915114133_6dcae72e0627a5d5d73b9f5b8356a622_3_mwpm_03200403.jpg"},{"uniquekey":"328a7c0a1afbc0b36693634eddd97aa5","title":"15岁入伍61岁晋升上将 这个新任军委要职的人不简单","date":"2017-09-15 11:38","category":"头条","author_name":"央视网","url":"http://mini.eastday.com/mobile/170915113823310.html","thumbnail_pic_s":"http://01.imgmini.eastday.com/mobile/20170915/20170915113823_34a56268df23d6ef44246fb958a95511_2_mwpm_03200403.jpg","thumbnail_pic_s02":"http://01.imgmini.eastday.com/mobile/20170915/20170915113823_34a56268df23d6ef44246fb958a95511_1_mwpm_03200403.jpg","thumbnail_pic_s03":"http://01.imgmini.eastday.com/mobile/20170915/20170915113823_34a56268df23d6ef44246fb958a95511_7_mwpm_03200403.jpg"},{"uniquekey":"488b4a9ee85734a2dbe820e125aa21a0","title":"台媒\u201c回忆\u201d中美南海撞机：飞行员曾请示应否回击","date":"2017-09-15 11:28","category":"头条","author_name":"环球网","url":"http://mini.eastday.com/mobile/170915112835458.html","thumbnail_pic_s":"http://01.imgmini.eastday.com/mobile/20170915/20170915112835_465547dba1a52d0ab3c8115cdde10d7a_1_mwpm_03200403.jpg"},{"uniquekey":"61fd8e6f2eca3ee766405669d546f857","title":"\u201c萨德使其生无可恋！\u201d在华韩企不满韩政府外交政策","date":"2017-09-15 11:28","category":"头条","author_name":"环球网","url":"http://mini.eastday.com/mobile/170915112835313.html","thumbnail_pic_s":"http://01.imgmini.eastday.com/mobile/20170915/20170915112835_a86e426a6a62a192cf831ef3e770863e_1_mwpm_03200403.jpg"},{"uniquekey":"af944d97d9d05a4c8e6b46f4826752c0","title":"比特币中国月底关停 辉煌时代的泡沫落幕，真的是福音吗？","date":"2017-09-15 11:47","category":"头条","author_name":"东方网东方头条黄毅","url":"http://mini.eastday.com/mobile/170915112647650.html","thumbnail_pic_s":"http://07.imgmini.eastday.com/mobile/20170915/20170915_3bed1db54ecdcaeec7e0614f22d22c09_cover_mwpm_03200403.jpg","thumbnail_pic_s02":"http://07.imgmini.eastday.com/mobile/20170915/20170915_5dc6b043f956db5d1261476075a4a06e_cover_mwpm_03200403.jpg","thumbnail_pic_s03":"http://07.imgmini.eastday.com/mobile/20170915/20170915_90cf6f514c79653448d5cd3ba65a2e99_cover_mwpm_03200403.jpg"},{"uniquekey":"0fdd26f142afd50bee09f38e40d74564","title":"上海休闲水族展乌龟开始唱主角，300万一只的土龟将亮相","date":"2017-09-15 11:20","category":"头条","author_name":"澎湃新闻网","url":"http://mini.eastday.com/mobile/170915112034999.html","thumbnail_pic_s":"http://06.imgmini.eastday.com/mobile/20170915/20170915112034_322cc35d2ac1d0aa6242c8cc0a4663a8_3_mwpm_03200403.jpg","thumbnail_pic_s02":"http://06.imgmini.eastday.com/mobile/20170915/20170915112034_322cc35d2ac1d0aa6242c8cc0a4663a8_2_mwpm_03200403.jpg","thumbnail_pic_s03":"http://06.imgmini.eastday.com/mobile/20170915/20170915112034_322cc35d2ac1d0aa6242c8cc0a4663a8_4_mwpm_03200403.jpg"},{"uniquekey":"54291cc6dc5faf8d51b8197ce0757db9","title":"南非女学生拼死抵抗持枪抢劫 只为保护毕业论文","date":"2017-09-15 11:19","category":"头条","author_name":"Mail Online","url":"http://mini.eastday.com/mobile/170915111934338.html","thumbnail_pic_s":"http://06.imgmini.eastday.com/mobile/20170915/20170915111934_1bea7425702de50b237534d4957ad976_3_mwpm_03200403.jpg","thumbnail_pic_s02":"http://06.imgmini.eastday.com/mobile/20170915/20170915111934_1bea7425702de50b237534d4957ad976_2_mwpm_03200403.jpg","thumbnail_pic_s03":"http://06.imgmini.eastday.com/mobile/20170915/20170915111934_1bea7425702de50b237534d4957ad976_1_mwpm_03200403.jpg"},{"uniquekey":"8a7fdf4998109bbfc0658b2a07334c27","title":"女人最迷人健康的八个身材特征，你有几个？","date":"2017-09-15 11:19","category":"头条","author_name":"奇怪美食录","url":"http://mini.eastday.com/mobile/170915111901836.html","thumbnail_pic_s":"http://07.imgmini.eastday.com/mobile/20170915/20170915_399ee7a5045976723fb3abac84750f05_cover_mwpm_03200403.jpg","thumbnail_pic_s02":"http://07.imgmini.eastday.com/mobile/20170915/20170915_0faa7dd26b1f53608443400dc14b75e9_cover_mwpm_03200403.jpg","thumbnail_pic_s03":"http://07.imgmini.eastday.com/mobile/20170915/20170915_5507457fe200744dbaa47c53d46a6b51_cover_mwpm_03200403.jpg"},{"uniquekey":"104c00d775c3b0abce5d35f396067c7f","title":"癌症将死之人，这个方法有效控制病情，7年后竟然自愈","date":"2017-09-15 11:16","category":"头条","author_name":"谈食社","url":"http://mini.eastday.com/mobile/170915111607188.html","thumbnail_pic_s":"http://06.imgmini.eastday.com/mobile/20170915/20170915_dd381d62e599ed345f07eb02abd2087c_cover_mwpm_03200403.jpg","thumbnail_pic_s02":"http://06.imgmini.eastday.com/mobile/20170915/20170915_a1b3ec0f26b1ad0273e795b9a9fab294_cover_mwpm_03200403.jpg","thumbnail_pic_s03":"http://06.imgmini.eastday.com/mobile/20170915/20170915_68aee5a83f11f9fe2b66a32d1950d4e6_cover_mwpm_03200403.jpg"}]}
     * error_code : 0
     */

    private String reason;
    private ResultBean result;
    private int error_code;

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public int getError_code() {
        return error_code;
    }

    public void setError_code(int error_code) {
        this.error_code = error_code;
    }

    @Override
    public String toString() {
        return "Entity{" +
                "reason='" + reason + '\'' +
                ", result=" + result +
                ", error_code=" + error_code +
                '}';
    }

    public static class ResultBean {
        /**
         * stat : 1
         * data : [{"uniquekey":"de66e3c7af85e1e749cc0778888f669e","title":"小学保安的请假条惊艳朋友圈 他曾当过十年村支书","date":"2017-09-15 13:20","category":"头条","author_name":"都市快报","url":"http://mini.eastday.com/mobile/170915132036727.html","thumbnail_pic_s":"http://01.imgmini.eastday.com/mobile/20170915/20170915132036_08300bca4da2693e41c49f5ec44de119_4_mwpm_03200403.jpg","thumbnail_pic_s02":"http://01.imgmini.eastday.com/mobile/20170915/20170915132036_08300bca4da2693e41c49f5ec44de119_1_mwpm_03200403.jpg","thumbnail_pic_s03":"http://01.imgmini.eastday.com/mobile/20170915/20170915132036_08300bca4da2693e41c49f5ec44de119_2_mwpm_03200403.jpg"},{"uniquekey":"24d3475226789ee8166a507afadcc3eb","title":"韩国庆北星州将新建高尔夫球场 因原球场被\u201c萨德\u201d占用","date":"2017-09-15 13:51","category":"头条","author_name":"环球网","url":"http://mini.eastday.com/mobile/170915135101925.html","thumbnail_pic_s":"http://09.imgmini.eastday.com/mobile/20170915/20170915135101_656e20ae0e8b0948a65734c423391083_1_mwpm_03200403.jpg"},{"uniquekey":"fb4698a8525bf08d7de4297a5b3f3c4f","title":"委内瑞拉推\u201c兔子计划\u201d缓解粮食危机：这不是宠物，是5斤肉","date":"2017-09-15 13:46","category":"头条","author_name":"澎湃新闻网","url":"http://mini.eastday.com/mobile/170915134641989.html","thumbnail_pic_s":"http://01.imgmini.eastday.com/mobile/20170915/20170915134641_a5672bd90b69e7c42043d6922f6da5b3_1_mwpm_03200403.jpg"},{"uniquekey":"f9d6e5f8bcb75ac53a76630e8b0524d2","title":"玉磨铁路\u201c9.14\u201d隧道塌方追踪：9名被困者生命体征平稳","date":"2017-09-15 13:37","category":"头条","author_name":"中国新闻网","url":"http://mini.eastday.com/mobile/170915133721728.html","thumbnail_pic_s":"http://09.imgmini.eastday.com/mobile/20170915/20170915133721_b5c27a8e13b2e8889a3cc2f6077e004a_2_mwpm_03200403.jpg","thumbnail_pic_s02":"http://09.imgmini.eastday.com/mobile/20170915/20170915133721_b5c27a8e13b2e8889a3cc2f6077e004a_1_mwpm_03200403.jpg"},{"uniquekey":"3c75305c0ef3e9b19b6b6d66a36eae17","title":"老红军、云南省人大原副主任颜义泉逝世，1934年参加长征","date":"2017-09-15 13:20","category":"头条","author_name":"云南网","url":"http://mini.eastday.com/mobile/170915132006033.html","thumbnail_pic_s":"http://08.imgmini.eastday.com/mobile/20170915/20170915132006_1270ff4ca1c1b47034dcc5f7be98724e_1_mwpm_03200403.jpg"},{"uniquekey":"145212b2b3c057186736548742795e5a","title":"西双版纳隧道坍塌被困9人确认存活，已用小管子打通塌方体","date":"2017-09-15 13:14","category":"头条","author_name":"新华社","url":"http://mini.eastday.com/mobile/170915131427310.html","thumbnail_pic_s":"http://09.imgmini.eastday.com/mobile/20170915/20170915131427_9bfccfc0656d4ce0cad33f0fd317cc68_1_mwpm_03200403.jpg"},{"uniquekey":"674bc1fe90bc3758d293d3f742570d49","title":"俄专家：为提高投票率，政府需为普京寻找明年大选的竞争对手","date":"2017-09-15 13:14","category":"头条","author_name":"澎湃新闻网","url":"http://mini.eastday.com/mobile/170915131426776.html","thumbnail_pic_s":"http://04.imgmini.eastday.com/mobile/20170915/20170915131426_eee3a99e754e1ee068c278186733c968_1_mwpm_03200403.jpg"},{"uniquekey":"effd6d207fca5577194b50ba0bbd960e","title":"美国演艺圈好闺蜜：演员捐肾给歌手","date":"2017-09-15 13:00","category":"头条","author_name":"环球时报","url":"http://mini.eastday.com/mobile/170915130018264.html","thumbnail_pic_s":"http://06.imgmini.eastday.com/mobile/20170915/20170915130018_f884e0d657debee709e8827e5d177317_1_mwpm_03200403.jpg"},{"uniquekey":"2ea06b4fc2c4b26224b2f4709af61dfc","title":"频现神秘\u201c诈弹\u201d威胁 俄安全部门\u201c忙坏了\u201d","date":"2017-09-15 13:00","category":"头条","author_name":"新华网","url":"http://mini.eastday.com/mobile/170915130018158.html","thumbnail_pic_s":"http://04.imgmini.eastday.com/mobile/20170915/20170915130018_ad7e52042db4ca67a47b35cf654e7af9_2_mwpm_03200403.jpg","thumbnail_pic_s02":"http://04.imgmini.eastday.com/mobile/20170915/20170915130018_ad7e52042db4ca67a47b35cf654e7af9_3_mwpm_03200403.jpg","thumbnail_pic_s03":"http://04.imgmini.eastday.com/mobile/20170915/20170915130018_ad7e52042db4ca67a47b35cf654e7af9_4_mwpm_03200403.jpg"},{"uniquekey":"9c6f24c42fb173d5b6c0eb4853427a71","title":"女子野外好心喂食小狐狸，不料却出现这样令人尴尬一幕！","date":"2017-09-15 12:46","category":"头条","author_name":"斯文笔子","url":"http://mini.eastday.com/mobile/170915124654276.html","thumbnail_pic_s":"http://07.imgmini.eastday.com/mobile/20170915/20170915_62e0aafcfb36849ec47eafaaf74c521f_cover_mwpm_03200403.jpg","thumbnail_pic_s02":"http://07.imgmini.eastday.com/mobile/20170915/20170915_226c3f4874ee405c00f132a939f4574b_cover_mwpm_03200403.jpg","thumbnail_pic_s03":"http://07.imgmini.eastday.com/mobile/20170915/20170915_e75ee453b9740d8349a57f62f2faeeff_cover_mwpm_03200403.jpg"},{"uniquekey":"5ec7ca3808a4c228a8771a03e1199e2f","title":"定了，雄安用人薪酬参照北京！你让河北人民怎么办？","date":"2017-09-15 12:45","category":"头条","author_name":"彩贝财经","url":"http://mini.eastday.com/mobile/170915124531359.html","thumbnail_pic_s":"http://06.imgmini.eastday.com/mobile/20170915/20170915124531_e53015b31ddf5f51e25aaf888c3edfc2_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://06.imgmini.eastday.com/mobile/20170915/20170915124531_e53015b31ddf5f51e25aaf888c3edfc2_2_mwpm_03200403.jpg","thumbnail_pic_s03":"http://06.imgmini.eastday.com/mobile/20170915/20170915124531_e53015b31ddf5f51e25aaf888c3edfc2_3_mwpm_03200403.jpg"},{"uniquekey":"d66b59f1057cb4fc47b08f814293e211","title":"9月底迎好运，未来得贵人相助，连连发财的3大生肖！","date":"2017-09-15 12:44","category":"头条","author_name":"吉名轩八字星座","url":"http://mini.eastday.com/mobile/170915124418382.html","thumbnail_pic_s":"http://07.imgmini.eastday.com/mobile/20170915/20170915_573cb141cf6ccc4aa2ebade931fa85a6_cover_mwpm_03200403.jpg","thumbnail_pic_s02":"http://07.imgmini.eastday.com/mobile/20170915/20170915_e49d3d676b6dba1dcb379b7e1d90edfa_cover_mwpm_03200403.jpg","thumbnail_pic_s03":"http://07.imgmini.eastday.com/mobile/20170915/20170915_5c4f6db51de3a33bc73f0605f62f944a_cover_mwpm_03200403.jpg"},{"uniquekey":"db2c6ac26be3c4bef768b9d5ebd224f6","title":"男童骑小黄车身亡案庭审：ofo称他违规使用损害财产","date":"2017-09-15 12:32","category":"头条","author_name":"澎湃新闻网","url":"http://mini.eastday.com/mobile/170915123259024.html","thumbnail_pic_s":"http://05.imgmini.eastday.com/mobile/20170915/20170915123259_d41d8cd98f00b204e9800998ecf8427e_1_mwpm_03200403.jpg"},{"uniquekey":"cb3fd6fcbd45afcee1f3717524c2cd15","title":"为何越南将重炮瞄准解放军,中国却毫不在意?答案让人腰杆挺得直","date":"2017-09-15 12:32","category":"头条","author_name":"军迷亮点","url":"http://mini.eastday.com/mobile/170915123234505.html","thumbnail_pic_s":"http://02.imgmini.eastday.com/mobile/20170915/20170915_29ffa8570204cf8dbd2e1570fef47d32_cover_mwpm_03200403.jpg","thumbnail_pic_s02":"http://02.imgmini.eastday.com/mobile/20170915/20170915_df2dd34d088f93368f1d1f6fca114f05_cover_mwpm_03200403.jpg","thumbnail_pic_s03":"http://02.imgmini.eastday.com/mobile/20170915/20170915_65102ee9f4ff6d881449d2188ed41cf3_cover_mwpm_03200403.jpg"},{"uniquekey":"283b11fdba1eef664d2cd454b2dcb1ae","title":"最新研究：中国内陆沙尘污染的真正根源是戈壁荒漠","date":"2017-09-15 12:19","category":"头条","author_name":"环球网","url":"http://mini.eastday.com/mobile/170915121938743.html","thumbnail_pic_s":"http://04.imgmini.eastday.com/mobile/20170915/20170915121938_9c117eb08f9af1db7bd9106fabf7e597_1_mwpm_03200403.jpg"},{"uniquekey":"a8effb9547f0f29c6238ce6f2ee50f9e","title":"一对小夫妻中午退房后，保洁阿姨进门看到这一幕都不敢进去打扫了","date":"2017-09-15 12:15","category":"头条","author_name":"奇趣有话说","url":"http://mini.eastday.com/mobile/170915121552796.html","thumbnail_pic_s":"http://08.imgmini.eastday.com/mobile/20170915/20170915_54d29334da387419eb4f341ab4a071a1_cover_mwpm_03200403.jpg","thumbnail_pic_s02":"http://08.imgmini.eastday.com/mobile/20170915/20170915_34951490b023184f580beea05ed7fc53_cover_mwpm_03200403.jpg","thumbnail_pic_s03":"http://08.imgmini.eastday.com/mobile/20170915/20170915_98668257239e145bbf2a0637b7da84d9_cover_mwpm_03200403.jpg"},{"uniquekey":"f673466907f9c1eea1cfdc9ac2c70764","title":"中国突然宣布抢占全球人工智能制高点，打响\"芯片\u201c收购战，特朗普不乐意了！","date":"2017-09-15 12:13","category":"头条","author_name":"搜狐","url":"http://mini.eastday.com/mobile/170915121347001.html","thumbnail_pic_s":"http://09.imgmini.eastday.com/mobile/20170915/20170915121347_cc27140fcd96542d164e8c897d94ee4f_3_mwpm_03200403.jpg","thumbnail_pic_s02":"http://09.imgmini.eastday.com/mobile/20170915/20170915121347_cc27140fcd96542d164e8c897d94ee4f_2_mwpm_03200403.jpg","thumbnail_pic_s03":"http://09.imgmini.eastday.com/mobile/20170915/20170915121347_cc27140fcd96542d164e8c897d94ee4f_4_mwpm_03200403.jpg"},{"uniquekey":"d2b7cad708a055a47fdddce12cd6800c","title":"湖南道县32岁退伍军人下水清堵溺亡，上千群众自发为其送行","date":"2017-09-15 11:56","category":"头条","author_name":"法制晚报·看法新闻","url":"http://mini.eastday.com/mobile/170915115607465.html","thumbnail_pic_s":"http://03.imgmini.eastday.com/mobile/20170915/20170915115607_72b3aa1fae8d3e52964f6b335d66f0d4_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://03.imgmini.eastday.com/mobile/20170915/20170915115607_72b3aa1fae8d3e52964f6b335d66f0d4_2_mwpm_03200403.jpg","thumbnail_pic_s03":"http://03.imgmini.eastday.com/mobile/20170915/20170915115607_72b3aa1fae8d3e52964f6b335d66f0d4_3_mwpm_03200403.jpg"},{"uniquekey":"6f16d0f03e8d3d36533084c671d94c68","title":"乐天准备\u201c挟起皮包走路\u201d，很好很好，不送","date":"2017-09-15 11:48","category":"头条","author_name":"火星方阵","url":"http://mini.eastday.com/mobile/170915114855616.html","thumbnail_pic_s":"http://02.imgmini.eastday.com/mobile/20170915/20170915_a477f4980558c20975a00e8638b03231_mwpm_03200403.jpg"},{"uniquekey":"f6ddec9db16da75a989b4c253b305027","title":"中国四大奇人，加起来活到1199岁，皇帝一波接一波，他们依然健在","date":"2017-09-15 11:45","category":"头条","author_name":"废池乔木","url":"http://mini.eastday.com/mobile/170915114523238.html","thumbnail_pic_s":"http://04.imgmini.eastday.com/mobile/20170915/20170915_607559dc29fe3fa5f6e574b69c063c7b_mwpm_03200403.jpg","thumbnail_pic_s02":"http://04.imgmini.eastday.com/mobile/20170915/20170915_81ea487de64c4ee2c9e72a7277a78512_cover_mwpm_03200403.jpg","thumbnail_pic_s03":"http://04.imgmini.eastday.com/mobile/20170915/20170915_34b9631842624bbb3609260cd471a6f5_cover_mwpm_03200403.jpg"},{"uniquekey":"21e446888552d5f6cac8a60b2287ebba","title":"上海辰山植物园纠错人民日报：配图里的30余种植物名称有误","date":"2017-09-15 11:41","category":"头条","author_name":"澎湃新闻网","url":"http://mini.eastday.com/mobile/170915114152231.html","thumbnail_pic_s":"http://01.imgmini.eastday.com/mobile/20170915/20170915114152_5975e501dd78a56963c9108fdcf757a4_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://01.imgmini.eastday.com/mobile/20170915/20170915114152_5975e501dd78a56963c9108fdcf757a4_9_mwpm_03200403.jpg","thumbnail_pic_s03":"http://01.imgmini.eastday.com/mobile/20170915/20170915114152_5975e501dd78a56963c9108fdcf757a4_5_mwpm_03200403.jpg"},{"uniquekey":"2e5edc911907af8e6181559e36af4f1e","title":"2017年的猪肉越来越难吃了，专家：真怨不得养猪人","date":"2017-09-15 11:41","category":"头条","author_name":"农村老林","url":"http://mini.eastday.com/mobile/170915114133258.html","thumbnail_pic_s":"http://02.imgmini.eastday.com/mobile/20170915/20170915114133_6dcae72e0627a5d5d73b9f5b8356a622_2_mwpm_03200403.jpg","thumbnail_pic_s02":"http://02.imgmini.eastday.com/mobile/20170915/20170915114133_6dcae72e0627a5d5d73b9f5b8356a622_1_mwpm_03200403.jpg","thumbnail_pic_s03":"http://02.imgmini.eastday.com/mobile/20170915/20170915114133_6dcae72e0627a5d5d73b9f5b8356a622_3_mwpm_03200403.jpg"},{"uniquekey":"328a7c0a1afbc0b36693634eddd97aa5","title":"15岁入伍61岁晋升上将 这个新任军委要职的人不简单","date":"2017-09-15 11:38","category":"头条","author_name":"央视网","url":"http://mini.eastday.com/mobile/170915113823310.html","thumbnail_pic_s":"http://01.imgmini.eastday.com/mobile/20170915/20170915113823_34a56268df23d6ef44246fb958a95511_2_mwpm_03200403.jpg","thumbnail_pic_s02":"http://01.imgmini.eastday.com/mobile/20170915/20170915113823_34a56268df23d6ef44246fb958a95511_1_mwpm_03200403.jpg","thumbnail_pic_s03":"http://01.imgmini.eastday.com/mobile/20170915/20170915113823_34a56268df23d6ef44246fb958a95511_7_mwpm_03200403.jpg"},{"uniquekey":"488b4a9ee85734a2dbe820e125aa21a0","title":"台媒\u201c回忆\u201d中美南海撞机：飞行员曾请示应否回击","date":"2017-09-15 11:28","category":"头条","author_name":"环球网","url":"http://mini.eastday.com/mobile/170915112835458.html","thumbnail_pic_s":"http://01.imgmini.eastday.com/mobile/20170915/20170915112835_465547dba1a52d0ab3c8115cdde10d7a_1_mwpm_03200403.jpg"},{"uniquekey":"61fd8e6f2eca3ee766405669d546f857","title":"\u201c萨德使其生无可恋！\u201d在华韩企不满韩政府外交政策","date":"2017-09-15 11:28","category":"头条","author_name":"环球网","url":"http://mini.eastday.com/mobile/170915112835313.html","thumbnail_pic_s":"http://01.imgmini.eastday.com/mobile/20170915/20170915112835_a86e426a6a62a192cf831ef3e770863e_1_mwpm_03200403.jpg"},{"uniquekey":"af944d97d9d05a4c8e6b46f4826752c0","title":"比特币中国月底关停 辉煌时代的泡沫落幕，真的是福音吗？","date":"2017-09-15 11:47","category":"头条","author_name":"东方网东方头条黄毅","url":"http://mini.eastday.com/mobile/170915112647650.html","thumbnail_pic_s":"http://07.imgmini.eastday.com/mobile/20170915/20170915_3bed1db54ecdcaeec7e0614f22d22c09_cover_mwpm_03200403.jpg","thumbnail_pic_s02":"http://07.imgmini.eastday.com/mobile/20170915/20170915_5dc6b043f956db5d1261476075a4a06e_cover_mwpm_03200403.jpg","thumbnail_pic_s03":"http://07.imgmini.eastday.com/mobile/20170915/20170915_90cf6f514c79653448d5cd3ba65a2e99_cover_mwpm_03200403.jpg"},{"uniquekey":"0fdd26f142afd50bee09f38e40d74564","title":"上海休闲水族展乌龟开始唱主角，300万一只的土龟将亮相","date":"2017-09-15 11:20","category":"头条","author_name":"澎湃新闻网","url":"http://mini.eastday.com/mobile/170915112034999.html","thumbnail_pic_s":"http://06.imgmini.eastday.com/mobile/20170915/20170915112034_322cc35d2ac1d0aa6242c8cc0a4663a8_3_mwpm_03200403.jpg","thumbnail_pic_s02":"http://06.imgmini.eastday.com/mobile/20170915/20170915112034_322cc35d2ac1d0aa6242c8cc0a4663a8_2_mwpm_03200403.jpg","thumbnail_pic_s03":"http://06.imgmini.eastday.com/mobile/20170915/20170915112034_322cc35d2ac1d0aa6242c8cc0a4663a8_4_mwpm_03200403.jpg"},{"uniquekey":"54291cc6dc5faf8d51b8197ce0757db9","title":"南非女学生拼死抵抗持枪抢劫 只为保护毕业论文","date":"2017-09-15 11:19","category":"头条","author_name":"Mail Online","url":"http://mini.eastday.com/mobile/170915111934338.html","thumbnail_pic_s":"http://06.imgmini.eastday.com/mobile/20170915/20170915111934_1bea7425702de50b237534d4957ad976_3_mwpm_03200403.jpg","thumbnail_pic_s02":"http://06.imgmini.eastday.com/mobile/20170915/20170915111934_1bea7425702de50b237534d4957ad976_2_mwpm_03200403.jpg","thumbnail_pic_s03":"http://06.imgmini.eastday.com/mobile/20170915/20170915111934_1bea7425702de50b237534d4957ad976_1_mwpm_03200403.jpg"},{"uniquekey":"8a7fdf4998109bbfc0658b2a07334c27","title":"女人最迷人健康的八个身材特征，你有几个？","date":"2017-09-15 11:19","category":"头条","author_name":"奇怪美食录","url":"http://mini.eastday.com/mobile/170915111901836.html","thumbnail_pic_s":"http://07.imgmini.eastday.com/mobile/20170915/20170915_399ee7a5045976723fb3abac84750f05_cover_mwpm_03200403.jpg","thumbnail_pic_s02":"http://07.imgmini.eastday.com/mobile/20170915/20170915_0faa7dd26b1f53608443400dc14b75e9_cover_mwpm_03200403.jpg","thumbnail_pic_s03":"http://07.imgmini.eastday.com/mobile/20170915/20170915_5507457fe200744dbaa47c53d46a6b51_cover_mwpm_03200403.jpg"},{"uniquekey":"104c00d775c3b0abce5d35f396067c7f","title":"癌症将死之人，这个方法有效控制病情，7年后竟然自愈","date":"2017-09-15 11:16","category":"头条","author_name":"谈食社","url":"http://mini.eastday.com/mobile/170915111607188.html","thumbnail_pic_s":"http://06.imgmini.eastday.com/mobile/20170915/20170915_dd381d62e599ed345f07eb02abd2087c_cover_mwpm_03200403.jpg","thumbnail_pic_s02":"http://06.imgmini.eastday.com/mobile/20170915/20170915_a1b3ec0f26b1ad0273e795b9a9fab294_cover_mwpm_03200403.jpg","thumbnail_pic_s03":"http://06.imgmini.eastday.com/mobile/20170915/20170915_68aee5a83f11f9fe2b66a32d1950d4e6_cover_mwpm_03200403.jpg"}]
         */

        private String stat;
        private List<DataBean> data;

        public String getStat() {
            return stat;
        }

        public void setStat(String stat) {
            this.stat = stat;
        }

        public List<DataBean> getData() {
            return data;
        }

        public void setData(List<DataBean> data) {
            this.data = data;
        }

        @Override
        public String toString() {
            return "ResultBean{" +
                    "stat='" + stat + '\'' +
                    ", data=" + data +
                    '}';
        }

        public static class DataBean {
            /**
             * uniquekey : de66e3c7af85e1e749cc0778888f669e
             * title : 小学保安的请假条惊艳朋友圈 他曾当过十年村支书
             * date : 2017-09-15 13:20
             * category : 头条
             * author_name : 都市快报
             * url : http://mini.eastday.com/mobile/170915132036727.html
             * thumbnail_pic_s : http://01.imgmini.eastday.com/mobile/20170915/20170915132036_08300bca4da2693e41c49f5ec44de119_4_mwpm_03200403.jpg
             * thumbnail_pic_s02 : http://01.imgmini.eastday.com/mobile/20170915/20170915132036_08300bca4da2693e41c49f5ec44de119_1_mwpm_03200403.jpg
             * thumbnail_pic_s03 : http://01.imgmini.eastday.com/mobile/20170915/20170915132036_08300bca4da2693e41c49f5ec44de119_2_mwpm_03200403.jpg
             */

            private String uniquekey;
            private String title;
            private String date;
            private String category;
            private String author_name;
            private String url;
            private String thumbnail_pic_s;
            private String thumbnail_pic_s02;
            private String thumbnail_pic_s03;

            public String getUniquekey() {
                return uniquekey;
            }

            public void setUniquekey(String uniquekey) {
                this.uniquekey = uniquekey;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }

            public String getCategory() {
                return category;
            }

            public void setCategory(String category) {
                this.category = category;
            }

            public String getAuthor_name() {
                return author_name;
            }

            public void setAuthor_name(String author_name) {
                this.author_name = author_name;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public String getThumbnail_pic_s() {
                return thumbnail_pic_s;
            }

            public void setThumbnail_pic_s(String thumbnail_pic_s) {
                this.thumbnail_pic_s = thumbnail_pic_s;
            }

            public String getThumbnail_pic_s02() {
                return thumbnail_pic_s02;
            }

            public void setThumbnail_pic_s02(String thumbnail_pic_s02) {
                this.thumbnail_pic_s02 = thumbnail_pic_s02;
            }

            public String getThumbnail_pic_s03() {
                return thumbnail_pic_s03;
            }

            public void setThumbnail_pic_s03(String thumbnail_pic_s03) {
                this.thumbnail_pic_s03 = thumbnail_pic_s03;
            }

            @Override
            public String toString() {
                return "DataBean{" +
                        "uniquekey='" + uniquekey + '\'' +
                        ", title='" + title + '\'' +
                        ", date='" + date + '\'' +
                        ", category='" + category + '\'' +
                        ", author_name='" + author_name + '\'' +
                        ", url='" + url + '\'' +
                        ", thumbnail_pic_s='" + thumbnail_pic_s + '\'' +
                        ", thumbnail_pic_s02='" + thumbnail_pic_s02 + '\'' +
                        ", thumbnail_pic_s03='" + thumbnail_pic_s03 + '\'' +
                        '}';
            }
        }
    }
}
