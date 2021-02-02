package com.luwei.DouyinReptile.entity.res.comment;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

/**
 * 评论的用户信息
 */
public class DouYinCommentUserDetailRes implements Serializable {

    private String uid;

    private String short_id;

    /**
     * 昵称
     */
    private String nickname;

    /**
     * 性别 1男 2女
     */
    private Integer gender;

    /**
     * 个性签名
     */
    private String signature;

    private DouYinCommentAvatarDetailRes avatar_larger;

    private DouYinCommentAvatarDetailRes avatar_thumb;

    private DouYinCommentAvatarDetailRes avatar_medium;

    /**
     * 生日
     */
    private String birthday;

    private Boolean is_verified;

    private Integer follow_status;

    private Integer aweme_count;

    private Integer following_count;

    private Integer follower_count;

    private Integer favoriting_count;

    private Integer total_favorited;

    private Boolean is_block;

    private Boolean hide_search;

    private Integer constellation;

    private Object location;

    private Boolean hide_location;

    private Object weibo_verify;

    private Object custom_verify;

    /**
     * 抖音号
     */
    private String unique_id;

    private String bind_phone;

    private Integer special_lock;

    private Integer need_recommend;

    private Boolean is_binded_weibo;

    private String weibo_name;

    private String weibo_schema;

    private String weibo_url;

    private Boolean story_open;

    private Integer story_count;

    private Boolean has_facebook_token;

    private Boolean has_twitter_token;

    private Integer fb_expire_time;

    private Integer tw_expire_time;

    private Boolean has_youtube_token;

    private Integer youtube_expire_time;

    private Integer room_id;

    private Integer live_verify;

    private Integer authority_status;

    private String verify_info;

    private Integer shield_follow_notice;

    private Integer shield_digg_notice;

    private Integer shield_comment_notice;

    private String school_name;

    private String school_poi_id;

    private Integer school_type;

    private Boolean with_commerce_entry;

    private Integer verification_type;

    private String enterprise_verify_reason;

    private Boolean is_ad_fake;

    private Object followers_detail;

    private String region;

    private String account_region;

    private Integer sync_to_toutiao;

    private Integer commerce_user_level;

    private Integer live_agreement;

    private Object platform_sync_info;

    private Boolean with_shop_entry;

    private Boolean is_discipline_member;

    private Integer secret;

    private Boolean has_orders;

    private Boolean prevent_download;

    private Boolean show_image_bubble;

    private List<Object> geofencing;

    private Long unique_id_modify_time;

    private DouYinCommentAvatarDetailRes video_icon;

    private String ins_id;

    private String google_account;

    private String youtube_channel_id;

    private String yooutube_channel_title;

    private Integer apple_account;

    private Boolean with_dou_entry;

    private Boolean with_fusion_shop_entry;

    private Boolean is_phone_binded;

    private Boolean accept_private_policy;

    private String twitter_id;

    private String twitter_name;

    private Boolean user_canceled;

    private Boolean has_email;

    private Boolean is_gov_media_vip;

    private Integer live_agreement_time;

    private Integer status;

    private Long create_time;

    private String avatar_uri;

    private Integer follower_status;

    private Integer neiguang_shield;

    private Integer comment_setting;

    private Integer duet_setting;

    private Integer reflow_page_gid;

    private Integer reflow_page_uid;

    private Integer user_rate;

    private Integer download_setting;

    private Integer download_prompt_ts;

    private Integer react_setting;

    private Boolean live_commerce;

    private List<DouYinCommentAvatarDetailRes> cover_url;

    private String language;

    private Boolean has_insights;

    private Object item_list;

    private Integer user_mode;

    private Integer user_period;

    private Boolean has_unread_story;

    private Object new_story_cover;

    private Boolean is_star;

    private Object cv_level;

    private Object type_label;

    private Object ad_cover_url;

    private Integer comment_filtr_status;

    private DouYinCommentAvatarDetailRes avatar_168x168;

    private DouYinCommentAvatarDetailRes avatar_300x300;

    private Object relative_users;

    private Object cha_list;

    private String sec_uid;

    private Object need_points;

    private Object homepage_bottom_toast;

    private Integer aweme_hotsoon_auth;

    private Object can_set_geofencing;

    private Object white_cover_url;

    private Object user_tags;

    private Integer stitch_setting;

    private Boolean enable_nearby_visible;

    private List<Object> ban_user_functions;

    private DouYinCommentAwemeControlDetailRes aweme_control;

    private BigDecimal ky_only_predict;

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getShort_id() {
        return short_id;
    }

    public void setShort_id(String short_id) {
        this.short_id = short_id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public DouYinCommentAvatarDetailRes getAvatar_larger() {
        return avatar_larger;
    }

    public void setAvatar_larger(DouYinCommentAvatarDetailRes avatar_larger) {
        this.avatar_larger = avatar_larger;
    }

    public DouYinCommentAvatarDetailRes getAvatar_thumb() {
        return avatar_thumb;
    }

    public void setAvatar_thumb(DouYinCommentAvatarDetailRes avatar_thumb) {
        this.avatar_thumb = avatar_thumb;
    }

    public DouYinCommentAvatarDetailRes getAvatar_medium() {
        return avatar_medium;
    }

    public void setAvatar_medium(DouYinCommentAvatarDetailRes avatar_medium) {
        this.avatar_medium = avatar_medium;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public Boolean getIs_verified() {
        return is_verified;
    }

    public void setIs_verified(Boolean is_verified) {
        this.is_verified = is_verified;
    }

    public Integer getFollow_status() {
        return follow_status;
    }

    public void setFollow_status(Integer follow_status) {
        this.follow_status = follow_status;
    }

    public Integer getAweme_count() {
        return aweme_count;
    }

    public void setAweme_count(Integer aweme_count) {
        this.aweme_count = aweme_count;
    }

    public Integer getFollowing_count() {
        return following_count;
    }

    public void setFollowing_count(Integer following_count) {
        this.following_count = following_count;
    }

    public Integer getFollower_count() {
        return follower_count;
    }

    public void setFollower_count(Integer follower_count) {
        this.follower_count = follower_count;
    }

    public Integer getFavoriting_count() {
        return favoriting_count;
    }

    public void setFavoriting_count(Integer favoriting_count) {
        this.favoriting_count = favoriting_count;
    }

    public Integer getTotal_favorited() {
        return total_favorited;
    }

    public void setTotal_favorited(Integer total_favorited) {
        this.total_favorited = total_favorited;
    }

    public Boolean getIs_block() {
        return is_block;
    }

    public void setIs_block(Boolean is_block) {
        this.is_block = is_block;
    }

    public Boolean getHide_search() {
        return hide_search;
    }

    public void setHide_search(Boolean hide_search) {
        this.hide_search = hide_search;
    }

    public Integer getConstellation() {
        return constellation;
    }

    public void setConstellation(Integer constellation) {
        this.constellation = constellation;
    }

    public Object getLocation() {
        return location;
    }

    public void setLocation(Object location) {
        this.location = location;
    }

    public Boolean getHide_location() {
        return hide_location;
    }

    public void setHide_location(Boolean hide_location) {
        this.hide_location = hide_location;
    }

    public Object getWeibo_verify() {
        return weibo_verify;
    }

    public void setWeibo_verify(Object weibo_verify) {
        this.weibo_verify = weibo_verify;
    }

    public Object getCustom_verify() {
        return custom_verify;
    }

    public void setCustom_verify(Object custom_verify) {
        this.custom_verify = custom_verify;
    }

    public String getUnique_id() {
        return unique_id;
    }

    public void setUnique_id(String unique_id) {
        this.unique_id = unique_id;
    }

    public String getBind_phone() {
        return bind_phone;
    }

    public void setBind_phone(String bind_phone) {
        this.bind_phone = bind_phone;
    }

    public Integer getSpecial_lock() {
        return special_lock;
    }

    public void setSpecial_lock(Integer special_lock) {
        this.special_lock = special_lock;
    }

    public Integer getNeed_recommend() {
        return need_recommend;
    }

    public void setNeed_recommend(Integer need_recommend) {
        this.need_recommend = need_recommend;
    }

    public Boolean getIs_binded_weibo() {
        return is_binded_weibo;
    }

    public void setIs_binded_weibo(Boolean is_binded_weibo) {
        this.is_binded_weibo = is_binded_weibo;
    }

    public String getWeibo_name() {
        return weibo_name;
    }

    public void setWeibo_name(String weibo_name) {
        this.weibo_name = weibo_name;
    }

    public String getWeibo_schema() {
        return weibo_schema;
    }

    public void setWeibo_schema(String weibo_schema) {
        this.weibo_schema = weibo_schema;
    }

    public String getWeibo_url() {
        return weibo_url;
    }

    public void setWeibo_url(String weibo_url) {
        this.weibo_url = weibo_url;
    }

    public Boolean getStory_open() {
        return story_open;
    }

    public void setStory_open(Boolean story_open) {
        this.story_open = story_open;
    }

    public Integer getStory_count() {
        return story_count;
    }

    public void setStory_count(Integer story_count) {
        this.story_count = story_count;
    }

    public Boolean getHas_facebook_token() {
        return has_facebook_token;
    }

    public void setHas_facebook_token(Boolean has_facebook_token) {
        this.has_facebook_token = has_facebook_token;
    }

    public Boolean getHas_twitter_token() {
        return has_twitter_token;
    }

    public void setHas_twitter_token(Boolean has_twitter_token) {
        this.has_twitter_token = has_twitter_token;
    }

    public Integer getFb_expire_time() {
        return fb_expire_time;
    }

    public void setFb_expire_time(Integer fb_expire_time) {
        this.fb_expire_time = fb_expire_time;
    }

    public Integer getTw_expire_time() {
        return tw_expire_time;
    }

    public void setTw_expire_time(Integer tw_expire_time) {
        this.tw_expire_time = tw_expire_time;
    }

    public Boolean getHas_youtube_token() {
        return has_youtube_token;
    }

    public void setHas_youtube_token(Boolean has_youtube_token) {
        this.has_youtube_token = has_youtube_token;
    }

    public Integer getYoutube_expire_time() {
        return youtube_expire_time;
    }

    public void setYoutube_expire_time(Integer youtube_expire_time) {
        this.youtube_expire_time = youtube_expire_time;
    }

    public Integer getRoom_id() {
        return room_id;
    }

    public void setRoom_id(Integer room_id) {
        this.room_id = room_id;
    }

    public Integer getLive_verify() {
        return live_verify;
    }

    public void setLive_verify(Integer live_verify) {
        this.live_verify = live_verify;
    }

    public Integer getAuthority_status() {
        return authority_status;
    }

    public void setAuthority_status(Integer authority_status) {
        this.authority_status = authority_status;
    }

    public String getVerify_info() {
        return verify_info;
    }

    public void setVerify_info(String verify_info) {
        this.verify_info = verify_info;
    }

    public Integer getShield_follow_notice() {
        return shield_follow_notice;
    }

    public void setShield_follow_notice(Integer shield_follow_notice) {
        this.shield_follow_notice = shield_follow_notice;
    }

    public Integer getShield_digg_notice() {
        return shield_digg_notice;
    }

    public void setShield_digg_notice(Integer shield_digg_notice) {
        this.shield_digg_notice = shield_digg_notice;
    }

    public Integer getShield_comment_notice() {
        return shield_comment_notice;
    }

    public void setShield_comment_notice(Integer shield_comment_notice) {
        this.shield_comment_notice = shield_comment_notice;
    }

    public String getSchool_name() {
        return school_name;
    }

    public void setSchool_name(String school_name) {
        this.school_name = school_name;
    }

    public String getSchool_poi_id() {
        return school_poi_id;
    }

    public void setSchool_poi_id(String school_poi_id) {
        this.school_poi_id = school_poi_id;
    }

    public Integer getSchool_type() {
        return school_type;
    }

    public void setSchool_type(Integer school_type) {
        this.school_type = school_type;
    }

    public Boolean getWith_commerce_entry() {
        return with_commerce_entry;
    }

    public void setWith_commerce_entry(Boolean with_commerce_entry) {
        this.with_commerce_entry = with_commerce_entry;
    }

    public Integer getVerification_type() {
        return verification_type;
    }

    public void setVerification_type(Integer verification_type) {
        this.verification_type = verification_type;
    }

    public String getEnterprise_verify_reason() {
        return enterprise_verify_reason;
    }

    public void setEnterprise_verify_reason(String enterprise_verify_reason) {
        this.enterprise_verify_reason = enterprise_verify_reason;
    }

    public Boolean getIs_ad_fake() {
        return is_ad_fake;
    }

    public void setIs_ad_fake(Boolean is_ad_fake) {
        this.is_ad_fake = is_ad_fake;
    }

    public Object getFollowers_detail() {
        return followers_detail;
    }

    public void setFollowers_detail(Object followers_detail) {
        this.followers_detail = followers_detail;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getAccount_region() {
        return account_region;
    }

    public void setAccount_region(String account_region) {
        this.account_region = account_region;
    }

    public Integer getSync_to_toutiao() {
        return sync_to_toutiao;
    }

    public void setSync_to_toutiao(Integer sync_to_toutiao) {
        this.sync_to_toutiao = sync_to_toutiao;
    }

    public Integer getCommerce_user_level() {
        return commerce_user_level;
    }

    public void setCommerce_user_level(Integer commerce_user_level) {
        this.commerce_user_level = commerce_user_level;
    }

    public Integer getLive_agreement() {
        return live_agreement;
    }

    public void setLive_agreement(Integer live_agreement) {
        this.live_agreement = live_agreement;
    }

    public Object getPlatform_sync_info() {
        return platform_sync_info;
    }

    public void setPlatform_sync_info(Object platform_sync_info) {
        this.platform_sync_info = platform_sync_info;
    }

    public Boolean getWith_shop_entry() {
        return with_shop_entry;
    }

    public void setWith_shop_entry(Boolean with_shop_entry) {
        this.with_shop_entry = with_shop_entry;
    }

    public Boolean getIs_discipline_member() {
        return is_discipline_member;
    }

    public void setIs_discipline_member(Boolean is_discipline_member) {
        this.is_discipline_member = is_discipline_member;
    }

    public Integer getSecret() {
        return secret;
    }

    public void setSecret(Integer secret) {
        this.secret = secret;
    }

    public Boolean getHas_orders() {
        return has_orders;
    }

    public void setHas_orders(Boolean has_orders) {
        this.has_orders = has_orders;
    }

    public Boolean getPrevent_download() {
        return prevent_download;
    }

    public void setPrevent_download(Boolean prevent_download) {
        this.prevent_download = prevent_download;
    }

    public Boolean getShow_image_bubble() {
        return show_image_bubble;
    }

    public void setShow_image_bubble(Boolean show_image_bubble) {
        this.show_image_bubble = show_image_bubble;
    }

    public List<Object> getGeofencing() {
        return geofencing;
    }

    public void setGeofencing(List<Object> geofencing) {
        this.geofencing = geofencing;
    }

    public Long getUnique_id_modify_time() {
        return unique_id_modify_time;
    }

    public void setUnique_id_modify_time(Long unique_id_modify_time) {
        this.unique_id_modify_time = unique_id_modify_time;
    }

    public DouYinCommentAvatarDetailRes getVideo_icon() {
        return video_icon;
    }

    public void setVideo_icon(DouYinCommentAvatarDetailRes video_icon) {
        this.video_icon = video_icon;
    }

    public String getIns_id() {
        return ins_id;
    }

    public void setIns_id(String ins_id) {
        this.ins_id = ins_id;
    }

    public String getGoogle_account() {
        return google_account;
    }

    public void setGoogle_account(String google_account) {
        this.google_account = google_account;
    }

    public String getYoutube_channel_id() {
        return youtube_channel_id;
    }

    public void setYoutube_channel_id(String youtube_channel_id) {
        this.youtube_channel_id = youtube_channel_id;
    }

    public String getYooutube_channel_title() {
        return yooutube_channel_title;
    }

    public void setYooutube_channel_title(String yooutube_channel_title) {
        this.yooutube_channel_title = yooutube_channel_title;
    }

    public Integer getApple_account() {
        return apple_account;
    }

    public void setApple_account(Integer apple_account) {
        this.apple_account = apple_account;
    }

    public Boolean getWith_dou_entry() {
        return with_dou_entry;
    }

    public void setWith_dou_entry(Boolean with_dou_entry) {
        this.with_dou_entry = with_dou_entry;
    }

    public Boolean getWith_fusion_shop_entry() {
        return with_fusion_shop_entry;
    }

    public void setWith_fusion_shop_entry(Boolean with_fusion_shop_entry) {
        this.with_fusion_shop_entry = with_fusion_shop_entry;
    }

    public Boolean getIs_phone_binded() {
        return is_phone_binded;
    }

    public void setIs_phone_binded(Boolean is_phone_binded) {
        this.is_phone_binded = is_phone_binded;
    }

    public Boolean getAccept_private_policy() {
        return accept_private_policy;
    }

    public void setAccept_private_policy(Boolean accept_private_policy) {
        this.accept_private_policy = accept_private_policy;
    }

    public String getTwitter_id() {
        return twitter_id;
    }

    public void setTwitter_id(String twitter_id) {
        this.twitter_id = twitter_id;
    }

    public String getTwitter_name() {
        return twitter_name;
    }

    public void setTwitter_name(String twitter_name) {
        this.twitter_name = twitter_name;
    }

    public Boolean getUser_canceled() {
        return user_canceled;
    }

    public void setUser_canceled(Boolean user_canceled) {
        this.user_canceled = user_canceled;
    }

    public Boolean getHas_email() {
        return has_email;
    }

    public void setHas_email(Boolean has_email) {
        this.has_email = has_email;
    }

    public Boolean getIs_gov_media_vip() {
        return is_gov_media_vip;
    }

    public void setIs_gov_media_vip(Boolean is_gov_media_vip) {
        this.is_gov_media_vip = is_gov_media_vip;
    }

    public Integer getLive_agreement_time() {
        return live_agreement_time;
    }

    public void setLive_agreement_time(Integer live_agreement_time) {
        this.live_agreement_time = live_agreement_time;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Long getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Long create_time) {
        this.create_time = create_time;
    }

    public String getAvatar_uri() {
        return avatar_uri;
    }

    public void setAvatar_uri(String avatar_uri) {
        this.avatar_uri = avatar_uri;
    }

    public Integer getFollower_status() {
        return follower_status;
    }

    public void setFollower_status(Integer follower_status) {
        this.follower_status = follower_status;
    }

    public Integer getNeiguang_shield() {
        return neiguang_shield;
    }

    public void setNeiguang_shield(Integer neiguang_shield) {
        this.neiguang_shield = neiguang_shield;
    }

    public Integer getComment_setting() {
        return comment_setting;
    }

    public void setComment_setting(Integer comment_setting) {
        this.comment_setting = comment_setting;
    }

    public Integer getDuet_setting() {
        return duet_setting;
    }

    public void setDuet_setting(Integer duet_setting) {
        this.duet_setting = duet_setting;
    }

    public Integer getReflow_page_gid() {
        return reflow_page_gid;
    }

    public void setReflow_page_gid(Integer reflow_page_gid) {
        this.reflow_page_gid = reflow_page_gid;
    }

    public Integer getReflow_page_uid() {
        return reflow_page_uid;
    }

    public void setReflow_page_uid(Integer reflow_page_uid) {
        this.reflow_page_uid = reflow_page_uid;
    }

    public Integer getUser_rate() {
        return user_rate;
    }

    public void setUser_rate(Integer user_rate) {
        this.user_rate = user_rate;
    }

    public Integer getDownload_setting() {
        return download_setting;
    }

    public void setDownload_setting(Integer download_setting) {
        this.download_setting = download_setting;
    }

    public Integer getDownload_prompt_ts() {
        return download_prompt_ts;
    }

    public void setDownload_prompt_ts(Integer download_prompt_ts) {
        this.download_prompt_ts = download_prompt_ts;
    }

    public Integer getReact_setting() {
        return react_setting;
    }

    public void setReact_setting(Integer react_setting) {
        this.react_setting = react_setting;
    }

    public Boolean getLive_commerce() {
        return live_commerce;
    }

    public void setLive_commerce(Boolean live_commerce) {
        this.live_commerce = live_commerce;
    }

    public List<DouYinCommentAvatarDetailRes> getCover_url() {
        return cover_url;
    }

    public void setCover_url(List<DouYinCommentAvatarDetailRes> cover_url) {
        this.cover_url = cover_url;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public Boolean getHas_insights() {
        return has_insights;
    }

    public void setHas_insights(Boolean has_insights) {
        this.has_insights = has_insights;
    }

    public Object getItem_list() {
        return item_list;
    }

    public void setItem_list(Object item_list) {
        this.item_list = item_list;
    }

    public Integer getUser_mode() {
        return user_mode;
    }

    public void setUser_mode(Integer user_mode) {
        this.user_mode = user_mode;
    }

    public Integer getUser_period() {
        return user_period;
    }

    public void setUser_period(Integer user_period) {
        this.user_period = user_period;
    }

    public Boolean getHas_unread_story() {
        return has_unread_story;
    }

    public void setHas_unread_story(Boolean has_unread_story) {
        this.has_unread_story = has_unread_story;
    }

    public Object getNew_story_cover() {
        return new_story_cover;
    }

    public void setNew_story_cover(Object new_story_cover) {
        this.new_story_cover = new_story_cover;
    }

    public Boolean getIs_star() {
        return is_star;
    }

    public void setIs_star(Boolean is_star) {
        this.is_star = is_star;
    }

    public Object getCv_level() {
        return cv_level;
    }

    public void setCv_level(Object cv_level) {
        this.cv_level = cv_level;
    }

    public Object getType_label() {
        return type_label;
    }

    public void setType_label(Object type_label) {
        this.type_label = type_label;
    }

    public Object getAd_cover_url() {
        return ad_cover_url;
    }

    public void setAd_cover_url(Object ad_cover_url) {
        this.ad_cover_url = ad_cover_url;
    }

    public Integer getComment_filtr_status() {
        return comment_filtr_status;
    }

    public void setComment_filtr_status(Integer comment_filtr_status) {
        this.comment_filtr_status = comment_filtr_status;
    }

    public DouYinCommentAvatarDetailRes getAvatar_168x168() {
        return avatar_168x168;
    }

    public void setAvatar_168x168(DouYinCommentAvatarDetailRes avatar_168x168) {
        this.avatar_168x168 = avatar_168x168;
    }

    public DouYinCommentAvatarDetailRes getAvatar_300x300() {
        return avatar_300x300;
    }

    public void setAvatar_300x300(DouYinCommentAvatarDetailRes avatar_300x300) {
        this.avatar_300x300 = avatar_300x300;
    }

    public Object getRelative_users() {
        return relative_users;
    }

    public void setRelative_users(Object relative_users) {
        this.relative_users = relative_users;
    }

    public Object getCha_list() {
        return cha_list;
    }

    public void setCha_list(Object cha_list) {
        this.cha_list = cha_list;
    }

    public String getSec_uid() {
        return sec_uid;
    }

    public void setSec_uid(String sec_uid) {
        this.sec_uid = sec_uid;
    }

    public Object getNeed_points() {
        return need_points;
    }

    public void setNeed_points(Object need_points) {
        this.need_points = need_points;
    }

    public Object getHomepage_bottom_toast() {
        return homepage_bottom_toast;
    }

    public void setHomepage_bottom_toast(Object homepage_bottom_toast) {
        this.homepage_bottom_toast = homepage_bottom_toast;
    }

    public Integer getAweme_hotsoon_auth() {
        return aweme_hotsoon_auth;
    }

    public void setAweme_hotsoon_auth(Integer aweme_hotsoon_auth) {
        this.aweme_hotsoon_auth = aweme_hotsoon_auth;
    }

    public Object getCan_set_geofencing() {
        return can_set_geofencing;
    }

    public void setCan_set_geofencing(Object can_set_geofencing) {
        this.can_set_geofencing = can_set_geofencing;
    }

    public Object getWhite_cover_url() {
        return white_cover_url;
    }

    public void setWhite_cover_url(Object white_cover_url) {
        this.white_cover_url = white_cover_url;
    }

    public Object getUser_tags() {
        return user_tags;
    }

    public void setUser_tags(Object user_tags) {
        this.user_tags = user_tags;
    }

    public Integer getStitch_setting() {
        return stitch_setting;
    }

    public void setStitch_setting(Integer stitch_setting) {
        this.stitch_setting = stitch_setting;
    }

    public Boolean getEnable_nearby_visible() {
        return enable_nearby_visible;
    }

    public void setEnable_nearby_visible(Boolean enable_nearby_visible) {
        this.enable_nearby_visible = enable_nearby_visible;
    }

    public List<Object> getBan_user_functions() {
        return ban_user_functions;
    }

    public void setBan_user_functions(List<Object> ban_user_functions) {
        this.ban_user_functions = ban_user_functions;
    }

    public DouYinCommentAwemeControlDetailRes getAweme_control() {
        return aweme_control;
    }

    public void setAweme_control(DouYinCommentAwemeControlDetailRes aweme_control) {
        this.aweme_control = aweme_control;
    }

    public BigDecimal getKy_only_predict() {
        return ky_only_predict;
    }

    public void setKy_only_predict(BigDecimal ky_only_predict) {
        this.ky_only_predict = ky_only_predict;
    }

    @Override
    public String toString() {
        return "DouYinCommentUserDetailRes{" +
                "uid='" + uid + '\'' +
                ", short_id='" + short_id + '\'' +
                ", nickname='" + nickname + '\'' +
                ", gender=" + gender +
                ", signature='" + signature + '\'' +
                ", avatar_larger=" + avatar_larger +
                ", avatar_thumb=" + avatar_thumb +
                ", avatar_medium=" + avatar_medium +
                ", birthday='" + birthday + '\'' +
                ", is_verified=" + is_verified +
                ", follow_status=" + follow_status +
                ", aweme_count=" + aweme_count +
                ", following_count=" + following_count +
                ", follower_count=" + follower_count +
                ", favoriting_count=" + favoriting_count +
                ", total_favorited=" + total_favorited +
                ", is_block=" + is_block +
                ", hide_search=" + hide_search +
                ", constellation=" + constellation +
                ", location=" + location +
                ", hide_location=" + hide_location +
                ", weibo_verify=" + weibo_verify +
                ", custom_verify=" + custom_verify +
                ", unique_id='" + unique_id + '\'' +
                ", bind_phone='" + bind_phone + '\'' +
                ", special_lock=" + special_lock +
                ", need_recommend=" + need_recommend +
                ", is_binded_weibo=" + is_binded_weibo +
                ", weibo_name='" + weibo_name + '\'' +
                ", weibo_schema='" + weibo_schema + '\'' +
                ", weibo_url='" + weibo_url + '\'' +
                ", story_open=" + story_open +
                ", story_count=" + story_count +
                ", has_facebook_token=" + has_facebook_token +
                ", has_twitter_token=" + has_twitter_token +
                ", fb_expire_time=" + fb_expire_time +
                ", tw_expire_time=" + tw_expire_time +
                ", has_youtube_token=" + has_youtube_token +
                ", youtube_expire_time=" + youtube_expire_time +
                ", room_id=" + room_id +
                ", live_verify=" + live_verify +
                ", authority_status=" + authority_status +
                ", verify_info='" + verify_info + '\'' +
                ", shield_follow_notice=" + shield_follow_notice +
                ", shield_digg_notice=" + shield_digg_notice +
                ", shield_comment_notice=" + shield_comment_notice +
                ", school_name='" + school_name + '\'' +
                ", school_poi_id='" + school_poi_id + '\'' +
                ", school_type=" + school_type +
                ", with_commerce_entry=" + with_commerce_entry +
                ", verification_type=" + verification_type +
                ", enterprise_verify_reason='" + enterprise_verify_reason + '\'' +
                ", is_ad_fake=" + is_ad_fake +
                ", followers_detail=" + followers_detail +
                ", region='" + region + '\'' +
                ", account_region='" + account_region + '\'' +
                ", sync_to_toutiao=" + sync_to_toutiao +
                ", commerce_user_level=" + commerce_user_level +
                ", live_agreement=" + live_agreement +
                ", platform_sync_info=" + platform_sync_info +
                ", with_shop_entry=" + with_shop_entry +
                ", is_discipline_member=" + is_discipline_member +
                ", secret=" + secret +
                ", has_orders=" + has_orders +
                ", prevent_download=" + prevent_download +
                ", show_image_bubble=" + show_image_bubble +
                ", geofencing=" + geofencing +
                ", unique_id_modify_time=" + unique_id_modify_time +
                ", video_icon=" + video_icon +
                ", ins_id='" + ins_id + '\'' +
                ", google_account='" + google_account + '\'' +
                ", youtube_channel_id='" + youtube_channel_id + '\'' +
                ", yooutube_channel_title='" + yooutube_channel_title + '\'' +
                ", apple_account=" + apple_account +
                ", with_dou_entry=" + with_dou_entry +
                ", with_fusion_shop_entry=" + with_fusion_shop_entry +
                ", is_phone_binded=" + is_phone_binded +
                ", accept_private_policy=" + accept_private_policy +
                ", twitter_id='" + twitter_id + '\'' +
                ", twitter_name='" + twitter_name + '\'' +
                ", user_canceled=" + user_canceled +
                ", has_email=" + has_email +
                ", is_gov_media_vip=" + is_gov_media_vip +
                ", live_agreement_time=" + live_agreement_time +
                ", status=" + status +
                ", create_time=" + create_time +
                ", avatar_uri='" + avatar_uri + '\'' +
                ", follower_status=" + follower_status +
                ", neiguang_shield=" + neiguang_shield +
                ", comment_setting=" + comment_setting +
                ", duet_setting=" + duet_setting +
                ", reflow_page_gid=" + reflow_page_gid +
                ", reflow_page_uid=" + reflow_page_uid +
                ", user_rate=" + user_rate +
                ", download_setting=" + download_setting +
                ", download_prompt_ts=" + download_prompt_ts +
                ", react_setting=" + react_setting +
                ", live_commerce=" + live_commerce +
                ", cover_url=" + cover_url +
                ", language='" + language + '\'' +
                ", has_insights=" + has_insights +
                ", item_list=" + item_list +
                ", user_mode=" + user_mode +
                ", user_period=" + user_period +
                ", has_unread_story=" + has_unread_story +
                ", new_story_cover=" + new_story_cover +
                ", is_star=" + is_star +
                ", cv_level=" + cv_level +
                ", type_label=" + type_label +
                ", ad_cover_url=" + ad_cover_url +
                ", comment_filtr_status=" + comment_filtr_status +
                ", avatar_168x168=" + avatar_168x168 +
                ", avatar_300x300=" + avatar_300x300 +
                ", relative_users=" + relative_users +
                ", cha_list=" + cha_list +
                ", sec_uid='" + sec_uid + '\'' +
                ", need_points=" + need_points +
                ", homepage_bottom_toast=" + homepage_bottom_toast +
                ", aweme_hotsoon_auth=" + aweme_hotsoon_auth +
                ", can_set_geofencing=" + can_set_geofencing +
                ", white_cover_url=" + white_cover_url +
                ", user_tags=" + user_tags +
                ", stitch_setting=" + stitch_setting +
                ", enable_nearby_visible=" + enable_nearby_visible +
                ", ban_user_functions=" + ban_user_functions +
                ", aweme_control=" + aweme_control +
                ", ky_only_predict=" + ky_only_predict +
                '}';
    }
}
