package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListAdapter;

/* renamed from: jwu */
public final class jwu extends akyg implements OnItemClickListener, hxf {
    private aywt[] Z;
    private int aa;
    private aies ab;

    /* Access modifiers changed, original: protected|final */
    public final int W() {
        return 0;
    }

    /* Access modifiers changed, original: protected|final */
    public final String X() {
        return null;
    }

    /* Access modifiers changed, original: protected|final */
    public final OnItemClickListener Y() {
        return this;
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.ab.a(((jwk) ((akyj) this.aq).getItem(i)).a);
        dismiss();
    }

    public final void a(aies aies) {
        this.ab = aies;
    }

    public final void a(aywt[] aywtArr, int i) {
        if (this.Z != aywtArr || this.aa != i) {
            this.Z = aywtArr;
            this.aa = i;
            akyj akyj = (akyj) this.aq;
            nn p = p();
            if (p != null && akyj != null && v()) {
                akyj.clear();
                jwu.a(p, akyj, aywtArr, i);
                akyj.notifyDataSetChanged();
            }
        }
    }

    public final void a(nn nnVar) {
        if (!F_() && !v()) {
            a(nnVar.f(), "PLAYBACK_RATE_MENU_BOTTOM_SHEET_FRAGMENT");
        }
    }

    private static void a(Context context, akyj akyj, aywt[] aywtArr, int i) {
        int i2 = 0;
        while (i2 < aywtArr.length) {
            jwk jwk = new jwk(context, aywtArr[i2]);
            jwk.a(i2 == i);
            akyj.add(jwk);
            i2++;
        }
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ ListAdapter Z() {
        akyj akyj = new akyj(p(), true);
        jwu.a(p(), akyj, this.Z, this.aa);
        return akyj;
    }
}
