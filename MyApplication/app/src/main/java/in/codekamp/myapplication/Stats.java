
package in.codekamp.myapplication;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Stats {

    @SerializedName("member_count")
    @Expose
    private Integer memberCount;
    @SerializedName("unsubscribe_count")
    @Expose
    private Integer unsubscribeCount;
    @SerializedName("cleaned_count")
    @Expose
    private Integer cleanedCount;
    @SerializedName("member_count_since_send")
    @Expose
    private Integer memberCountSinceSend;
    @SerializedName("unsubscribe_count_since_send")
    @Expose
    private Integer unsubscribeCountSinceSend;
    @SerializedName("cleaned_count_since_send")
    @Expose
    private Integer cleanedCountSinceSend;
    @SerializedName("campaign_count")
    @Expose
    private Integer campaignCount;
    @SerializedName("grouping_count")
    @Expose
    private Integer groupingCount;
    @SerializedName("group_count")
    @Expose
    private Integer groupCount;
    @SerializedName("merge_var_count")
    @Expose
    private Integer mergeVarCount;
    @SerializedName("avg_sub_rate")
    @Expose
    private Integer avgSubRate;
    @SerializedName("avg_unsub_rate")
    @Expose
    private Integer avgUnsubRate;
    @SerializedName("target_sub_rate")
    @Expose
    private Integer targetSubRate;
    @SerializedName("open_rate")
    @Expose
    private Double openRate;
    @SerializedName("click_rate")
    @Expose
    private Double clickRate;
    @SerializedName("date_last_campaign")
    @Expose
    private String dateLastCampaign;

    /**
     * 
     * @return
     *     The memberCount
     */
    public Integer getMemberCount() {
        return memberCount;
    }

    /**
     * 
     * @param memberCount
     *     The member_count
     */
    public void setMemberCount(Integer memberCount) {
        this.memberCount = memberCount;
    }

    /**
     * 
     * @return
     *     The unsubscribeCount
     */
    public Integer getUnsubscribeCount() {
        return unsubscribeCount;
    }

    /**
     * 
     * @param unsubscribeCount
     *     The unsubscribe_count
     */
    public void setUnsubscribeCount(Integer unsubscribeCount) {
        this.unsubscribeCount = unsubscribeCount;
    }

    /**
     * 
     * @return
     *     The cleanedCount
     */
    public Integer getCleanedCount() {
        return cleanedCount;
    }

    /**
     * 
     * @param cleanedCount
     *     The cleaned_count
     */
    public void setCleanedCount(Integer cleanedCount) {
        this.cleanedCount = cleanedCount;
    }

    /**
     * 
     * @return
     *     The memberCountSinceSend
     */
    public Integer getMemberCountSinceSend() {
        return memberCountSinceSend;
    }

    /**
     * 
     * @param memberCountSinceSend
     *     The member_count_since_send
     */
    public void setMemberCountSinceSend(Integer memberCountSinceSend) {
        this.memberCountSinceSend = memberCountSinceSend;
    }

    /**
     * 
     * @return
     *     The unsubscribeCountSinceSend
     */
    public Integer getUnsubscribeCountSinceSend() {
        return unsubscribeCountSinceSend;
    }

    /**
     * 
     * @param unsubscribeCountSinceSend
     *     The unsubscribe_count_since_send
     */
    public void setUnsubscribeCountSinceSend(Integer unsubscribeCountSinceSend) {
        this.unsubscribeCountSinceSend = unsubscribeCountSinceSend;
    }

    /**
     * 
     * @return
     *     The cleanedCountSinceSend
     */
    public Integer getCleanedCountSinceSend() {
        return cleanedCountSinceSend;
    }

    /**
     * 
     * @param cleanedCountSinceSend
     *     The cleaned_count_since_send
     */
    public void setCleanedCountSinceSend(Integer cleanedCountSinceSend) {
        this.cleanedCountSinceSend = cleanedCountSinceSend;
    }

    /**
     * 
     * @return
     *     The campaignCount
     */
    public Integer getCampaignCount() {
        return campaignCount;
    }

    /**
     * 
     * @param campaignCount
     *     The campaign_count
     */
    public void setCampaignCount(Integer campaignCount) {
        this.campaignCount = campaignCount;
    }

    /**
     * 
     * @return
     *     The groupingCount
     */
    public Integer getGroupingCount() {
        return groupingCount;
    }

    /**
     * 
     * @param groupingCount
     *     The grouping_count
     */
    public void setGroupingCount(Integer groupingCount) {
        this.groupingCount = groupingCount;
    }

    /**
     * 
     * @return
     *     The groupCount
     */
    public Integer getGroupCount() {
        return groupCount;
    }

    /**
     * 
     * @param groupCount
     *     The group_count
     */
    public void setGroupCount(Integer groupCount) {
        this.groupCount = groupCount;
    }

    /**
     * 
     * @return
     *     The mergeVarCount
     */
    public Integer getMergeVarCount() {
        return mergeVarCount;
    }

    /**
     * 
     * @param mergeVarCount
     *     The merge_var_count
     */
    public void setMergeVarCount(Integer mergeVarCount) {
        this.mergeVarCount = mergeVarCount;
    }

    /**
     * 
     * @return
     *     The avgSubRate
     */
    public Integer getAvgSubRate() {
        return avgSubRate;
    }

    /**
     * 
     * @param avgSubRate
     *     The avg_sub_rate
     */
    public void setAvgSubRate(Integer avgSubRate) {
        this.avgSubRate = avgSubRate;
    }

    /**
     * 
     * @return
     *     The avgUnsubRate
     */
    public Integer getAvgUnsubRate() {
        return avgUnsubRate;
    }

    /**
     * 
     * @param avgUnsubRate
     *     The avg_unsub_rate
     */
    public void setAvgUnsubRate(Integer avgUnsubRate) {
        this.avgUnsubRate = avgUnsubRate;
    }

    /**
     * 
     * @return
     *     The targetSubRate
     */
    public Integer getTargetSubRate() {
        return targetSubRate;
    }

    /**
     * 
     * @param targetSubRate
     *     The target_sub_rate
     */
    public void setTargetSubRate(Integer targetSubRate) {
        this.targetSubRate = targetSubRate;
    }

    /**
     * 
     * @return
     *     The openRate
     */
    public Double getOpenRate() {
        return openRate;
    }

    /**
     * 
     * @param openRate
     *     The open_rate
     */
    public void setOpenRate(Double openRate) {
        this.openRate = openRate;
    }

    /**
     * 
     * @return
     *     The clickRate
     */
    public Double getClickRate() {
        return clickRate;
    }

    /**
     * 
     * @param clickRate
     *     The click_rate
     */
    public void setClickRate(Double clickRate) {
        this.clickRate = clickRate;
    }

    /**
     * 
     * @return
     *     The dateLastCampaign
     */
    public String getDateLastCampaign() {
        return dateLastCampaign;
    }

    /**
     * 
     * @param dateLastCampaign
     *     The date_last_campaign
     */
    public void setDateLastCampaign(String dateLastCampaign) {
        this.dateLastCampaign = dateLastCampaign;
    }

}
