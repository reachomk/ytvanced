package defpackage;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamite.DynamiteModule;

@qlp
/* renamed from: rkn */
public final class rkn {
    public rkg a;
    public boolean b;

    public rkn(Context context, String str) {
        roe.a(context);
        try {
            String str2 = "com.google.android.gms.ads.clearcut.DynamiteClearcutLogger";
            try {
                this.a = (rkg) rkq.a.a(DynamiteModule.a(context, DynamiteModule.a, "com.google.android.gms.ads.dynamite").a(str2));
                qct.a((Object) context);
                this.a.a(qct.a((Object) context), str);
                this.b = true;
            } catch (Exception e) {
                throw new qmn(e);
            } catch (Exception e2) {
                throw new qmn(e2);
            }
        } catch (RemoteException | NullPointerException | qmn unused) {
        }
    }
}
