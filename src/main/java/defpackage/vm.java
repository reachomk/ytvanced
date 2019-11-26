package defpackage;

import android.media.session.MediaSessionManager.RemoteUserInfo;

/* renamed from: vm */
final class vm extends vp {
    vm(String str, int i, int i2) {
        super(str, i, i2);
        RemoteUserInfo remoteUserInfo = new RemoteUserInfo(str, i, i2);
    }

    vm(RemoteUserInfo remoteUserInfo) {
        super(remoteUserInfo.getPackageName(), remoteUserInfo.getPid(), remoteUserInfo.getUid());
    }
}
