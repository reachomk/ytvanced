package com.google.vr.sdk.base.sensors.internal;

import java.util.concurrent.TimeUnit;

public class LowPassFilter {
    public static final double NANOS_TO_SECONDS;
    public final Vector3d filteredData = new Vector3d();
    public long lastTimestampNs;
    public int numSamples;
    public final Vector3d temp = new Vector3d();
    public final double timeConstantSecs;

    public LowPassFilter(double d) {
        this.timeConstantSecs = 1.0d / (d * 6.283185307179586d);
    }

    public int getNumSamples() {
        return this.numSamples;
    }

    public void addSample(Vector3d vector3d, long j) {
        addWeightedSample(vector3d, j, 1.0d);
    }

    public void addWeightedSample(Vector3d vector3d, long j, double d) {
        int i = this.numSamples + 1;
        this.numSamples = i;
        if (i == 1) {
            this.filteredData.set(vector3d);
            this.lastTimestampNs = j;
            return;
        }
        double d2 = (double) (j - this.lastTimestampNs);
        Double.isNaN(d2);
        d = (d * d2) * NANOS_TO_SECONDS;
        d /= this.timeConstantSecs + d;
        this.filteredData.scale(1.0d - d);
        this.temp.set(vector3d);
        this.temp.scale(d);
        vector3d = this.temp;
        Vector3d vector3d2 = this.filteredData;
        Vector3d.add(vector3d, vector3d2, vector3d2);
        this.lastTimestampNs = j;
    }

    public Vector3d getFilteredData() {
        return this.filteredData;
    }

    static {
        double convert = (double) TimeUnit.NANOSECONDS.convert(1, TimeUnit.SECONDS);
        Double.isNaN(convert);
        NANOS_TO_SECONDS = 1.0d / convert;
    }
}
