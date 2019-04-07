package com.ooqiu.gaming.microservicedemodomain.domain;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

public class Article implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String source;

    @Column(name = "source_name")
    private String sourceName;

    @Column(name = "source_id")
    private String sourceId;

    private String title;

    private String type;

    @Column(name = "read_count")
    private Integer readCount;

    @Column(name = "share_count")
    private Integer shareCount;

    @Column(name = "comment_count")
    private Integer commentCount;

    private String url;

    @Column(name = "is_hot")
    private String isHot;

    @Column(name = "is_top")
    private String isTop;

    private String introduction;

    private String tag;

    private String cover;

    @Column(name = "cover_show_type")
    private String coverShowType;

    @Column(name = "share_type")
    private String shareType;

    @Column(name = "can_comment")
    private String canComment;

    @Column(name = "content_type")
    private String contentType;

    @Column(name = "unlike_enable")
    private String unlikeEnable;

    @Column(name = "show_comment")
    private String showComment;

    @Column(name = "unlike_num")
    private Integer unlikeNum;

    @Column(name = "like_num")
    private Integer likeNum;

    private String tips;

    @Column(name = "font_color")
    private String fontColor;

    @Column(name = "font_bold")
    private String fontBold;

    @Column(name = "share_url")
    private String shareUrl;

    @Column(name = "like_num_show")
    private String likeNumShow;

    @Column(name = "unlike_num_show")
    private String unlikeNumShow;

    @Column(name = "iNative")
    private String inative;

    @Column(name = "skip_ad")
    private String skipAd;

    @Column(name = "is_h5")
    private String isH5;

    @Column(name = "author_id")
    private Long authorId;

    @Column(name = "show_article")
    private String showArticle;

    @Column(name = "create_by")
    private Long createBy;

    @Column(name = "create_date")
    private Date createDate;

    @Column(name = "update_by")
    private Long updateBy;

    @Column(name = "update_date")
    private Date updateDate;

    private String remark;

    @Column(name = "del_flag")
    private String delFlag;

    private String extend;

    /**
     * @return id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return source
     */
    public String getSource() {
        return source;
    }

    /**
     * @param source
     */
    public void setSource(String source) {
        this.source = source;
    }

    /**
     * @return source_name
     */
    public String getSourceName() {
        return sourceName;
    }

    /**
     * @param sourceName
     */
    public void setSourceName(String sourceName) {
        this.sourceName = sourceName;
    }

    /**
     * @return source_id
     */
    public String getSourceId() {
        return sourceId;
    }

    /**
     * @param sourceId
     */
    public void setSourceId(String sourceId) {
        this.sourceId = sourceId;
    }

    /**
     * @return title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return read_count
     */
    public Integer getReadCount() {
        return readCount;
    }

    /**
     * @param readCount
     */
    public void setReadCount(Integer readCount) {
        this.readCount = readCount;
    }

    /**
     * @return share_count
     */
    public Integer getShareCount() {
        return shareCount;
    }

    /**
     * @param shareCount
     */
    public void setShareCount(Integer shareCount) {
        this.shareCount = shareCount;
    }

    /**
     * @return comment_count
     */
    public Integer getCommentCount() {
        return commentCount;
    }

    /**
     * @param commentCount
     */
    public void setCommentCount(Integer commentCount) {
        this.commentCount = commentCount;
    }

    /**
     * @return url
     */
    public String getUrl() {
        return url;
    }

    /**
     * @param url
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * @return is_hot
     */
    public String getIsHot() {
        return isHot;
    }

    /**
     * @param isHot
     */
    public void setIsHot(String isHot) {
        this.isHot = isHot;
    }

    /**
     * @return is_top
     */
    public String getIsTop() {
        return isTop;
    }

    /**
     * @param isTop
     */
    public void setIsTop(String isTop) {
        this.isTop = isTop;
    }

    /**
     * @return introduction
     */
    public String getIntroduction() {
        return introduction;
    }

    /**
     * @param introduction
     */
    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    /**
     * @return tag
     */
    public String getTag() {
        return tag;
    }

    /**
     * @param tag
     */
    public void setTag(String tag) {
        this.tag = tag;
    }

    /**
     * @return cover
     */
    public String getCover() {
        return cover;
    }

    /**
     * @param cover
     */
    public void setCover(String cover) {
        this.cover = cover;
    }

    /**
     * @return cover_show_type
     */
    public String getCoverShowType() {
        return coverShowType;
    }

    /**
     * @param coverShowType
     */
    public void setCoverShowType(String coverShowType) {
        this.coverShowType = coverShowType;
    }

    /**
     * @return share_type
     */
    public String getShareType() {
        return shareType;
    }

    /**
     * @param shareType
     */
    public void setShareType(String shareType) {
        this.shareType = shareType;
    }

    /**
     * @return can_comment
     */
    public String getCanComment() {
        return canComment;
    }

    /**
     * @param canComment
     */
    public void setCanComment(String canComment) {
        this.canComment = canComment;
    }

    /**
     * @return content_type
     */
    public String getContentType() {
        return contentType;
    }

    /**
     * @param contentType
     */
    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    /**
     * @return unlike_enable
     */
    public String getUnlikeEnable() {
        return unlikeEnable;
    }

    /**
     * @param unlikeEnable
     */
    public void setUnlikeEnable(String unlikeEnable) {
        this.unlikeEnable = unlikeEnable;
    }

    /**
     * @return show_comment
     */
    public String getShowComment() {
        return showComment;
    }

    /**
     * @param showComment
     */
    public void setShowComment(String showComment) {
        this.showComment = showComment;
    }

    /**
     * @return unlike_num
     */
    public Integer getUnlikeNum() {
        return unlikeNum;
    }

    /**
     * @param unlikeNum
     */
    public void setUnlikeNum(Integer unlikeNum) {
        this.unlikeNum = unlikeNum;
    }

    /**
     * @return like_num
     */
    public Integer getLikeNum() {
        return likeNum;
    }

    /**
     * @param likeNum
     */
    public void setLikeNum(Integer likeNum) {
        this.likeNum = likeNum;
    }

    /**
     * @return tips
     */
    public String getTips() {
        return tips;
    }

    /**
     * @param tips
     */
    public void setTips(String tips) {
        this.tips = tips;
    }

    /**
     * @return font_color
     */
    public String getFontColor() {
        return fontColor;
    }

    /**
     * @param fontColor
     */
    public void setFontColor(String fontColor) {
        this.fontColor = fontColor;
    }

    /**
     * @return font_bold
     */
    public String getFontBold() {
        return fontBold;
    }

    /**
     * @param fontBold
     */
    public void setFontBold(String fontBold) {
        this.fontBold = fontBold;
    }

    /**
     * @return share_url
     */
    public String getShareUrl() {
        return shareUrl;
    }

    /**
     * @param shareUrl
     */
    public void setShareUrl(String shareUrl) {
        this.shareUrl = shareUrl;
    }

    /**
     * @return like_num_show
     */
    public String getLikeNumShow() {
        return likeNumShow;
    }

    /**
     * @param likeNumShow
     */
    public void setLikeNumShow(String likeNumShow) {
        this.likeNumShow = likeNumShow;
    }

    /**
     * @return unlike_num_show
     */
    public String getUnlikeNumShow() {
        return unlikeNumShow;
    }

    /**
     * @param unlikeNumShow
     */
    public void setUnlikeNumShow(String unlikeNumShow) {
        this.unlikeNumShow = unlikeNumShow;
    }

    /**
     * @return iNative
     */
    public String getInative() {
        return inative;
    }

    /**
     * @param inative
     */
    public void setInative(String inative) {
        this.inative = inative;
    }

    /**
     * @return skip_ad
     */
    public String getSkipAd() {
        return skipAd;
    }

    /**
     * @param skipAd
     */
    public void setSkipAd(String skipAd) {
        this.skipAd = skipAd;
    }

    /**
     * @return is_h5
     */
    public String getIsH5() {
        return isH5;
    }

    /**
     * @param isH5
     */
    public void setIsH5(String isH5) {
        this.isH5 = isH5;
    }

    /**
     * @return author_id
     */
    public Long getAuthorId() {
        return authorId;
    }

    /**
     * @param authorId
     */
    public void setAuthorId(Long authorId) {
        this.authorId = authorId;
    }

    /**
     * @return show_article
     */
    public String getShowArticle() {
        return showArticle;
    }

    /**
     * @param showArticle
     */
    public void setShowArticle(String showArticle) {
        this.showArticle = showArticle;
    }

    /**
     * @return create_by
     */
    public Long getCreateBy() {
        return createBy;
    }

    /**
     * @param createBy
     */
    public void setCreateBy(Long createBy) {
        this.createBy = createBy;
    }

    /**
     * @return create_date
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * @param createDate
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * @return update_by
     */
    public Long getUpdateBy() {
        return updateBy;
    }

    /**
     * @param updateBy
     */
    public void setUpdateBy(Long updateBy) {
        this.updateBy = updateBy;
    }

    /**
     * @return update_date
     */
    public Date getUpdateDate() {
        return updateDate;
    }

    /**
     * @param updateDate
     */
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * @return remark
     */
    public String getRemark() {
        return remark;
    }

    /**
     * @param remark
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * @return del_flag
     */
    public String getDelFlag() {
        return delFlag;
    }

    /**
     * @param delFlag
     */
    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag;
    }

    /**
     * @return extend
     */
    public String getExtend() {
        return extend;
    }

    /**
     * @param extend
     */
    public void setExtend(String extend) {
        this.extend = extend;
    }
}