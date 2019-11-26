package defpackage;

import android.content.Context;
import com.google.mediapipe.framework.Graph;

/* renamed from: wgi */
public final class wgi {
    public final Context a;
    public Graph b;

    public wgi(Context context) {
        this.a = context;
    }

    static {
        try {
            System.loadLibrary("drishti_jni_native");
        } catch (UnsatisfiedLinkError unused) {
            xtl.c("Failed to load drishti_jni_native");
        }
    }
}
