package defpackage;

import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;

/* renamed from: aldu */
final /* synthetic */ class aldu implements OnCheckedChangeListener {
    private final alds a;
    private final aldp b;

    aldu(alds alds, aldp aldp) {
        this.a = alds;
        this.b = aldp;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        this.b.a(this.a.b, z);
    }
}
