package defpackage;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListAdapter;
import com.google.android.youtube.R;

/* renamed from: jwy */
public final class jwy extends akyg implements OnItemClickListener, hxx {
    private aajq[] Z;
    private int aa;
    private int ab;
    private boolean ac;
    private boolean ad;
    private aihy ae;

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

    public final void ad_() {
        super.ad_();
        dismiss();
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.ae.a(((jwn) ((akyj) this.aq).getItem(i)).a());
        dismiss();
    }

    public final void a(aihy aihy) {
        this.ae = aihy;
    }

    public final void a(aajq[] aajqArr, int i, int i2, boolean z, boolean z2) {
        if (!(this.Z == aajqArr && this.aa == i)) {
            this.Z = aajqArr;
            this.aa = i;
            this.ab = i2;
            ListAdapter listAdapter = this.aq;
            if (listAdapter != null) {
                ((akyj) listAdapter).notifyDataSetChanged();
            }
        }
        this.ac = z;
        this.ad = z2;
    }

    public final void a(nn nnVar) {
        if (!F_() && !v()) {
            a(nnVar.f(), "VIDEO_QUALITIES_MENU_BOTTOM_SHEET_FRAGMENT");
        }
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ ListAdapter Z() {
        akyj akyj = new akyj(p(), true);
        aajq[] aajqArr = this.Z;
        if (aajqArr != null && aajqArr.length > 0) {
            int i = 0;
            while (true) {
                aajq[] aajqArr2 = this.Z;
                if (i >= aajqArr2.length) {
                    break;
                }
                jwn jwn = new jwn(p(), aajqArr2[i]);
                if (!(this.ad && this.ac)) {
                    jwn.a(i == this.aa);
                }
                jwn.g = null;
                if (this.ad && jwn.a() == -2 && this.ac) {
                    String str;
                    jwn.a(true);
                    int i2 = this.aa;
                    String str2 = " ";
                    if (i2 <= 0 || i2 >= this.Z.length) {
                        i2 = this.ab;
                        if (i2 <= 0 || i2 >= this.Z.length) {
                            str = "";
                        } else {
                            str = String.valueOf(q().getString(R.string.quality_label, new Object[]{this.Z[this.ab].b}));
                            str = str.length() == 0 ? new String(str2) : str2.concat(str);
                        }
                    } else {
                        str = String.valueOf(q().getString(R.string.quality_label, new Object[]{this.Z[this.aa].b}));
                        str = str.length() == 0 ? new String(str2) : str2.concat(str);
                    }
                    jwn.g = str;
                }
                akyj.add(jwn);
                i++;
            }
        }
        return akyj;
    }
}
