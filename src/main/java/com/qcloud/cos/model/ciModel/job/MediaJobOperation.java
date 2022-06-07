package com.qcloud.cos.model.ciModel.job;

import com.qcloud.cos.model.ciModel.common.MediaOutputObject;
import com.qcloud.cos.model.ciModel.mediaInfo.MediaInfoObjcet;
import com.qcloud.cos.model.ciModel.template.MediaSegmentObject;
import com.qcloud.cos.model.ciModel.template.MediaSnapshotObject;
import com.qcloud.cos.model.ciModel.template.MediaWatermark;

import java.util.ArrayList;
import java.util.List;

/**
 * 媒体处理 operation实体 https://cloud.tencent.com/document/product/460/48234
 */

public class MediaJobOperation {
    private String templateId;
    private MediaOutputObject output;
    private MediaAnimationObject mediaAnimation;
    private MediaInfoObjcet mediaInfo;
    private MediaRemoveWaterMark removeWatermark;
    private MediaWatermark watermark;
    private MediaTranscodeObject transcode;
    private List<String> watermarkTemplateId;
    private List<MediaWatermark> watermarkList;
    private MediaConcatTemplateObject mediaConcatTemplate;
    private MediaSnapshotObject snapshot = new MediaSnapshotObject();
    private MediaSegmentObject segment = new MediaSegmentObject();
    private MediaDigitalWatermark digitalWatermark = new MediaDigitalWatermark();
    private ExtractDigitalWatermark extractDigitalWatermark = new ExtractDigitalWatermark();
    private MediaPicProcessTemplateObject picProcess = new MediaPicProcessTemplateObject();

    public MediaJobOperation() {
        this.output = new MediaOutputObject();
    }

    public String getTemplateId() {
        return templateId;
    }

    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

    public MediaOutputObject getOutput() {
        if (output == null) {
            output = new MediaOutputObject();
        }
        return output;
    }

    public void setOutput(MediaOutputObject output) {
        this.output = output;
    }

    public MediaAnimationObject getMediaAnimation() {
        if (mediaAnimation == null) {
            mediaAnimation = new MediaAnimationObject();
        }
        return mediaAnimation;
    }

    public MediaInfoObjcet getMediaInfo() {
        if (mediaInfo == null) {
            mediaInfo = new MediaInfoObjcet();
        }
        return mediaInfo;
    }

    public void setMediaInfo(MediaInfoObjcet mediaInfo) {
        this.mediaInfo = mediaInfo;
    }

    public MediaRemoveWaterMark getRemoveWatermark() {
        if (removeWatermark == null) {
            removeWatermark = new MediaRemoveWaterMark();
        }
        return removeWatermark;
    }

    public void setRemoveWatermark(MediaRemoveWaterMark removeWatermark) {
        this.removeWatermark = removeWatermark;
    }

    public void setMediaAnimation(MediaAnimationObject mediaAnimation) {
        this.mediaAnimation = mediaAnimation;
    }

    public MediaWatermark getWatermark() {
        if (watermark == null) {
            watermark = new MediaWatermark();
        }
        return watermark;
    }

    public void setWatermark(MediaWatermark watermark) {
        this.watermark = watermark;
    }


    public List<String> getWatermarkTemplateId() {
        if (watermarkTemplateId == null) {
            watermarkTemplateId = new ArrayList<>();
        }
        return watermarkTemplateId;
    }

    public void setWatermarkTemplateId(List<String> watermarkTemplateId) {
        this.watermarkTemplateId = watermarkTemplateId;
    }

    public MediaConcatTemplateObject getMediaConcatTemplate() {
        if (mediaConcatTemplate == null) {
            mediaConcatTemplate = new MediaConcatTemplateObject();
        }
        return mediaConcatTemplate;
    }

    public void setMediaConcatTemplate(MediaConcatTemplateObject mediaConcatTemplate) {
        this.mediaConcatTemplate = mediaConcatTemplate;
    }

    public MediaTranscodeObject getTranscode() {
        if (transcode == null) {
            transcode = new MediaTranscodeObject();
        }
        return transcode;
    }

    public void setTranscode(MediaTranscodeObject transcode) {
        this.transcode = transcode;
    }

    public MediaDigitalWatermark getDigitalWatermark() {
        return digitalWatermark;
    }

    public void setDigitalWatermark(MediaDigitalWatermark digitalWatermark) {
        this.digitalWatermark = digitalWatermark;
    }

    public ExtractDigitalWatermark getExtractDigitalWatermark() {
        return extractDigitalWatermark;
    }

    public void setExtractDigitalWatermark(ExtractDigitalWatermark extractDigitalWatermark) {
        this.extractDigitalWatermark = extractDigitalWatermark;
    }

    public MediaPicProcessTemplateObject getPicProcess() {
        return picProcess;
    }

    public void setPicProcess(MediaPicProcessTemplateObject picProcess) {
        this.picProcess = picProcess;
    }

    public MediaSnapshotObject getSnapshot() {
        return snapshot;
    }

    public void setSnapshot(MediaSnapshotObject snapshot) {
        this.snapshot = snapshot;
    }

    public MediaSegmentObject getSegment() {
        return segment;
    }

    public void setSegment(MediaSegmentObject segment) {
        this.segment = segment;
    }

    public List<MediaWatermark> getWatermarkList() {
        if (watermarkList == null) {
            watermarkList = new ArrayList<>();
        }
        return watermarkList;
    }

    public void setWatermarkList(List<MediaWatermark> watermarkList) {
        this.watermarkList = watermarkList;
    }

    @Override
    public String toString() {
        return "MediaJobOperation{" +
                "templateId='" + templateId + '\'' +
                ", output=" + output +
                ", mediaAnimation=" + mediaAnimation +
                ", mediaInfo=" + mediaInfo +
                ", removeWatermark=" + removeWatermark +
                ", watermark=" + watermark +
                ", transcode=" + transcode +
                ", watermarkTemplateId=" + watermarkTemplateId +
                ", watermarkList=" + watermarkList +
                ", mediaConcatTemplate=" + mediaConcatTemplate +
                ", snapshot=" + snapshot +
                ", segment=" + segment +
                ", digitalWatermark=" + digitalWatermark +
                ", extractDigitalWatermark=" + extractDigitalWatermark +
                ", picProcess=" + picProcess +
                '}';
    }
}
