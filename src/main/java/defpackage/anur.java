package defpackage;

import com.google.mediapipe.framework.GlSyncToken;
import com.google.mediapipe.framework.TextureFrame;

/* renamed from: anur */
public class anur implements TextureFrame {
    private final int a;
    private final int b;
    public boolean c = false;
    public boolean d = false;
    public GlSyncToken e = null;
    private final int f;
    private final long g = Long.MIN_VALUE;

    public anur(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.f = i3;
    }

    public final int getTextureName() {
        return this.a;
    }

    public final int getWidth() {
        return this.b;
    }

    public final int getHeight() {
        return this.f;
    }

    public final long getTimestamp() {
        return this.g;
    }

    public void release() {
        synchronized (this) {
            this.c = false;
            this.d = false;
            notifyAll();
        }
    }

    public final void release(GlSyncToken glSyncToken) {
        synchronized (this) {
            GlSyncToken glSyncToken2 = this.e;
            if (glSyncToken2 != null) {
                glSyncToken2.release();
                this.e = null;
            }
            this.e = glSyncToken;
            this.d = false;
            notifyAll();
        }
    }

    public final void finalize() {
        GlSyncToken glSyncToken = this.e;
        if (glSyncToken != null) {
            glSyncToken.release();
            this.e = null;
        }
    }
}
