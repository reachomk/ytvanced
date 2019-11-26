package com.google.vr.sdk.base.sensors.internal;

public class GyroscopeBiasEstimator {
    public LowPassFilter accelLowPass;
    public LowPassFilter gyroBiasLowPass;
    public LowPassFilter gyroLowPass;
    public IsStaticCounter isAccelStatic;
    public IsStaticCounter isGyroStatic;
    public Vector3d smoothedAccelDiff;
    public Vector3d smoothedGyroDiff;

    class IsStaticCounter {
        public int consecutiveIsStatic;
        public final int minStaticFrames = 10;

        IsStaticCounter(int i) {
        }

        /* Access modifiers changed, original: 0000 */
        public void appendFrame(boolean z) {
            if (z) {
                this.consecutiveIsStatic++;
            } else {
                this.consecutiveIsStatic = 0;
            }
        }

        /* Access modifiers changed, original: 0000 */
        public boolean isRecentlyStatic() {
            return this.consecutiveIsStatic >= this.minStaticFrames;
        }
    }

    public GyroscopeBiasEstimator() {
        reset();
    }

    public void reset() {
        this.smoothedGyroDiff = new Vector3d();
        this.smoothedAccelDiff = new Vector3d();
        this.accelLowPass = new LowPassFilter(1.0d);
        this.gyroLowPass = new LowPassFilter(10.0d);
        this.gyroBiasLowPass = new LowPassFilter(0.15000000596046448d);
        this.isAccelStatic = new IsStaticCounter(10);
        this.isGyroStatic = new IsStaticCounter(10);
    }

    public void processGyroscope(Vector3d vector3d, long j) {
        this.gyroLowPass.addSample(vector3d, j);
        Vector3d.sub(vector3d, this.gyroLowPass.getFilteredData(), this.smoothedGyroDiff);
        this.isGyroStatic.appendFrame(this.smoothedGyroDiff.length() < 0.00800000037997961d);
        if (this.isGyroStatic.isRecentlyStatic() && this.isAccelStatic.isRecentlyStatic()) {
            updateGyroBias(vector3d, j);
        }
    }

    public void processAccelerometer(Vector3d vector3d, long j) {
        this.accelLowPass.addSample(vector3d, j);
        Vector3d.sub(vector3d, this.accelLowPass.getFilteredData(), this.smoothedAccelDiff);
        this.isAccelStatic.appendFrame(this.smoothedAccelDiff.length() < 0.5d);
    }

    public void getGyroBias(Vector3d vector3d) {
        if (this.gyroBiasLowPass.getNumSamples() < 30) {
            vector3d.setZero();
            return;
        }
        vector3d.set(this.gyroBiasLowPass.getFilteredData());
        double numSamples = (double) (this.gyroBiasLowPass.getNumSamples() - 30);
        Double.isNaN(numSamples);
        vector3d.scale(Math.min(1.0d, numSamples / 100.0d));
    }

    private void updateGyroBias(Vector3d vector3d, long j) {
        if (vector3d.length() < 0.3499999940395355d) {
            double max = Math.max(0.0d, 1.0d - (vector3d.length() / 0.3499999940395355d));
            this.gyroBiasLowPass.addWeightedSample(this.gyroLowPass.getFilteredData(), j, max * max);
        }
    }
}
