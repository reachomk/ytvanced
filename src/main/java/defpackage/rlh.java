package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;

/* renamed from: rlh */
public final class rlh extends rlk {
    private final /* synthetic */ Context a;
    private final /* synthetic */ String b;
    private final /* synthetic */ qji c;
    private final /* synthetic */ rle d;

    public rlh(rle rle, Context context, String str, qji qji) {
        this.d = rle;
        this.a = context;
        this.b = str;
        this.c = qji;
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ Object a() {
        rle.a(this.a, "native_ad");
        return new rnh();
    }

    public final /* synthetic */ Object b() {
        rkt rkt = this.d.b;
        Context context = this.a;
        String str = this.b;
        qji qji = this.c;
        try {
            IBinder a = ((rlx) rkt.a(context)).a(qct.a((Object) context), str, qji);
            if (a == null) {
                return null;
            }
            IInterface queryLocalInterface = a.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            if (queryLocalInterface instanceof rlw) {
                return (rlw) queryLocalInterface;
            }
            return new rly(a);
        } catch (RemoteException | qcv e) {
            qml.b("Could not create remote builder for AdLoader.", e);
            return null;
        }
    }

    public final /* synthetic */ Object a(rmm rmm) {
        return rmm.a(qct.a(this.a), this.b, this.c);
    }
}
