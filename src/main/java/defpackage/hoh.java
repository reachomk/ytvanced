package defpackage;

import android.content.Context;
import com.google.android.youtube.R;
import java.util.concurrent.TimeUnit;

/* renamed from: hoh */
public final class hoh extends hnm {
    private final Context a;

    public hoh(bcaa bcaa, Context context) {
        super(bcaa, auwl.class);
        this.a = context;
    }

    /* Access modifiers changed, original: protected|final|bridge|synthetic */
    public final /* bridge */ /* synthetic */ Object a(amur amur) {
        return null;
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ Object a(agvz agvz, amur amur) {
        int toDays;
        for (agqy agqy : agvz.k().a()) {
            agqw agqw = agqy.j;
            if (agqw != null && agqw.g() > 0) {
                toDays = (int) TimeUnit.SECONDS.toDays(agqy.j.g());
                break;
            }
        }
        toDays = -1;
        if (toDays <= 0) {
            return null;
        }
        auwq auwq = (auwq) auwr.c.createBuilder();
        String[] strArr = new String[1];
        strArr[0] = this.a.getResources().getQuantityString(R.plurals.offline_go_online_to_renew_dialog_message, toDays, new Object[]{Integer.valueOf(toDays)});
        arml a = ajqy.a(strArr);
        auwq.copyOnWrite();
        auwr auwr = (auwr) auwq.instance;
        if (a != null) {
            auwr.b = a;
            auwr.a |= 1;
            auwr auwr2 = (auwr) ((anxl) auwq.build());
            auwk auwk = (auwk) auwl.i.createBuilder();
            auws auws = (auws) auwt.c.createBuilder();
            auws.copyOnWrite();
            auwt auwt = (auwt) auws.instance;
            if (auwr2 != null) {
                auwt.b = auwr2;
                auwt.a |= 1;
                auwk.copyOnWrite();
                auwl auwl = (auwl) auwk.instance;
                auwl.e = (auwt) ((anxl) auws.build());
                auwl.a |= 2;
                auwm auwm = (auwm) auwn.c.createBuilder();
                auwm.copyOnWrite();
                auwn auwn = (auwn) auwm.instance;
                auwn.a = 1 | auwn.a;
                auwn.b = 2;
                auwk.copyOnWrite();
                auwl auwl2 = (auwl) auwk.instance;
                auwl2.f = (auwn) ((anxl) auwm.build());
                auwl2.a |= 16;
                return (auwl) ((anxl) auwk.build());
            }
            throw new NullPointerException();
        }
        throw new NullPointerException();
    }
}
