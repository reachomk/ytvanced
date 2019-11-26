package com.google.android.apps.youtube.embeddedplayer.service.service.jar;

import android.os.Handler;
import android.os.RemoteException;
import android.util.SparseArray;
import com.google.android.apps.youtube.embeddedplayer.service.service.jar.IUiElementRegistrarService.Stub;
import defpackage.nat;
import defpackage.nhv;
import defpackage.nhz;
import defpackage.nia;

public final class RemoteUiElementRegistrar {
    private final nhv a;
    private final SparseArray b = new SparseArray();
    private nat c;
    private UiElementRegistrarService d;

    class UiElementRegistrarService extends Stub {
        public final nhv a;
        private final Handler b;

        public final void a(int i) {
            this.b.post(new RemoteUiElementRegistrar$UiElementRegistrarService$$Lambda$0(this, i));
        }

        /* synthetic */ UiElementRegistrarService(Handler handler, nhv nhv) {
            this.b = handler;
            this.a = nhv;
        }
    }

    public RemoteUiElementRegistrar(Integer[] numArr, Handler handler, nhv nhv, nat nat) {
        this.a = nhv;
        this.c = nat;
        this.d = new UiElementRegistrarService(handler, nhv);
        for (Integer intValue : numArr) {
            int intValue2 = intValue.intValue();
            nhz remoteUiElementRegistrar$$Lambda$0 = new RemoteUiElementRegistrar$$Lambda$0(this, intValue2);
            this.b.put(intValue2, remoteUiElementRegistrar$$Lambda$0);
            nhv.a(intValue2, remoteUiElementRegistrar$$Lambda$0);
        }
        try {
            nat.a(this.d);
        } catch (RemoteException unused) {
        }
    }

    public final synchronized void a(int i, boolean z) {
        nat nat = this.c;
        if (nat != null) {
            try {
                nat.a(i, z);
            } catch (RemoteException unused) {
            }
        }
    }

    public final synchronized void a() {
        this.d = null;
        this.c = null;
        for (int i = 0; i < this.b.size(); i++) {
            nhv nhv = this.a;
            nhz nhz = (nhz) this.b.valueAt(i);
            nia nia = (nia) nhv.a.get(this.b.keyAt(i));
            if (nia != null) {
                nia.b.remove(nhz);
            }
        }
        this.b.clear();
    }
}
