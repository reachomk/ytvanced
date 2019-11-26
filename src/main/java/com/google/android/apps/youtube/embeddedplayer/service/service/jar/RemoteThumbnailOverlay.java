package com.google.android.apps.youtube.embeddedplayer.service.service.jar;

import android.graphics.Bitmap;
import android.os.RemoteException;
import defpackage.aigp;
import defpackage.amqw;
import defpackage.nao;

public class RemoteThumbnailOverlay implements aigp {
    public nao a;

    public RemoteThumbnailOverlay(nao nao) {
        this.a = (nao) amqw.a((Object) nao, (Object) "client cannot be null");
    }

    public final void af_() {
        nao nao = this.a;
        if (nao != null) {
            try {
                nao.a();
            } catch (RemoteException unused) {
            }
        }
    }

    public final void ag_() {
        nao nao = this.a;
        if (nao != null) {
            try {
                nao.b();
            } catch (RemoteException unused) {
            }
        }
    }

    public final void at_() {
        nao nao = this.a;
        if (nao != null) {
            try {
                nao.c();
            } catch (RemoteException unused) {
            }
        }
    }

    public final void a(Bitmap bitmap) {
        nao nao = this.a;
        if (nao != null) {
            try {
                nao.a(bitmap);
            } catch (RemoteException unused) {
            }
        }
    }
}
