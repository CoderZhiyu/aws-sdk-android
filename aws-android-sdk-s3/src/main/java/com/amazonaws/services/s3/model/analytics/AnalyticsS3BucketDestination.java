/*
 * Copyright 2011-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at:
 *
 *    http://aws.amazon.com/apache2.0
 *
 * This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES
 * OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and
 * limitations under the License.
 */
package com.amazonaws.services.s3.model.analytics;

import java.io.Serializable;

/**
 * The AnalyticsS3BucketDestination class.
 */
public class AnalyticsS3BucketDestination implements Serializable {
    private String format;
    private String bucketAccountId;
    private String bucketArn;
    private String prefix;

    /**
     * Sets the file format used when exporting data to Amazon S3.
     * @param format the AnalyticsS3ExportFileFormat.
     */
    public void setFormat(AnalyticsS3ExportFileFormat format) {
        if (format == null) {
            setFormat((String) null);
        } else {
            setFormat(format.toString());
        }
    }

    /**
     * Sets the file format used when exporting data to Amazon S3.
     * Returns this object for method chaining.
     * @param format the AnalyticsS3ExportFileFormat.
     * @return this object for method chaining.
     */
    @SuppressWarnings("checkstyle:hiddenfield")
    public AnalyticsS3BucketDestination withFormat(AnalyticsS3ExportFileFormat format) {
        setFormat(format);
        return this;
    }

    /**
     * @return the file format used when exporting data to Amazon S3.
     */
    public String getFormat() {
        return format;
    }

    /**
     * Sets the file format.
     * @param format the format used when exporting data to Amazon S3.
     */
    public void setFormat(String format) {
        this.format = format;
    }

    /**
     * Sets the file format used when exporting data to Amazon S3.
     * Returns this object for method chaining.
     * @param format used when exporting data to Amazon S3.
     * @return this object for method chaining.
     */
    @SuppressWarnings("checkstyle:hiddenfield")
    public AnalyticsS3BucketDestination withFormat(String format) {
        setFormat(format);
        return this;
    }

    /**
     * @return the account ID that owns the destination bucket.
     */
    public String getBucketAccountId() {
        return bucketAccountId;
    }

    /**
     * Sets the account ID that owns the destination bucket.
     * If no account ID is provided, the owner will not be validated prior to exporting data.
     * @param bucketAccountId the bucket account ID.
     */
    public void setBucketAccountId(String bucketAccountId) {
        this.bucketAccountId = bucketAccountId;
    }

    /**
     * Sets the account ID that owns the destination bucket and returns this object for method chaining.
     * If no account ID is provided, the owner will not be validated prior to exporting data.
     * @param bucketAccountId the bucket account ID.
     * @return this object for method chaining.
     */
    @SuppressWarnings("checkstyle:hiddenfield")
    public AnalyticsS3BucketDestination withBucketAccountId(String bucketAccountId) {
        setBucketAccountId(bucketAccountId);
        return this;
    }

    /**
     * Returns the Amazon resource name (ARN) of the bucket to which data is exported.
     * @return the bucket arn.
     */
    public String getBucketArn() {
        return bucketArn;
    }

    /**
     * Sets the Amazon resource name (ARN) of the bucket to which data is exported.
     * @param bucketArn the bucket arn.
     */
    public void setBucketArn(String bucketArn) {
        this.bucketArn = bucketArn;
    }

    /**
     * Sets the Amazon resource name (ARN) of the bucket to which data is exported
     * and returns this object for method chaining.
     * @param bucketArn the bucket arn.
     * @return this object for method chaining.
     */
    @SuppressWarnings("checkstyle:hiddenfield")
    public AnalyticsS3BucketDestination withBucketArn(String bucketArn) {
        setBucketArn(bucketArn);
        return this;
    }

    /**
     * Returns the prefix to use when exporting data.
     * @return the prefix.
     */
    public String getPrefix() {
        return prefix;
    }

    /**
     * Sets the prefix to use when exporting data. The exported data begins with this prefix.
     * @param prefix used when exporting data.
     */
    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    /**
     * Sets the prefix to use when exporting data. The exported data begins with this prefix.
     * The object is returned for method chaining.
     * @param prefix used when exporting data.
     * @return this object for method chaining..
     */
    @SuppressWarnings("checkstyle:hiddenfield")
    public AnalyticsS3BucketDestination withPrefix(String prefix) {
        setPrefix(prefix);
        return this;
    }
}
