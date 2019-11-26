package defpackage;

import android.media.session.MediaSessionManager.RemoteUserInfo;
import android.os.Build.VERSION;

/* renamed from: vk */
public final class vk {
    private final vn a;

    public vk(String str, int i, int i2) {
        if (VERSION.SDK_INT >= 28) {
            this.a = new vm(str, i, i2);
        } else {
            this.a = new vp(str, i, i2);
        }
    }

    public vk(RemoteUserInfo remoteUserInfo) {
        this.a = new vm(remoteUserInfo);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return obj instanceof vk ? this.a.equals(((vk) obj).a) : false;
        } else {
            return true;
        }
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
