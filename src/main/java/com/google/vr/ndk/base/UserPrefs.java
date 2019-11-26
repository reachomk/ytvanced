package com.google.vr.ndk.base;

public class UserPrefs {
    public static final String TAG = UserPrefs.class.getSimpleName();
    public final long nativeUserPrefs;

    public enum RuntimeFeature {
        GVR_BETA_FEATURE_DAYDREAM_6DOF_CONTROLLER(1000, "com.google.vr.beta.daydream_6dof_controller", "Use6DofController"),
        GVR_BETA_FEATURE_SEE_THROUGH(1001, "com.google.vr.beta.cameraSeeThrough", "EnableSeeThrough");
        
        public final int id;
        public final String prefKey;
        public final String tag;

        private RuntimeFeature(int i, String str, String str2) {
            this.id = i;
            this.tag = str;
            this.prefKey = str2;
        }

        public static RuntimeFeature fromId(int i) {
            for (RuntimeFeature runtimeFeature : values()) {
                if (runtimeFeature.id == i) {
                    return runtimeFeature;
                }
            }
            return null;
        }

        public static RuntimeFeature[] fromIds(int[] iArr) {
            int i = 0;
            if (iArr == null) {
                return new RuntimeFeature[0];
            }
            RuntimeFeature[] runtimeFeatureArr = new RuntimeFeature[iArr.length];
            while (i < runtimeFeatureArr.length) {
                runtimeFeatureArr[i] = fromId(iArr[i]);
                i++;
            }
            return runtimeFeatureArr;
        }
    }

    UserPrefs(long j) {
        this.nativeUserPrefs = j;
    }

    public boolean isFeatureEnabled(RuntimeFeature runtimeFeature) {
        return GvrApi.nativeUserPrefsIsFeatureEnabled(this.nativeUserPrefs, runtimeFeature.id);
    }
}
