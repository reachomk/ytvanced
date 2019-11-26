package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: fic */
final class fic implements OnClickListener {
    private final auac a;
    private final atzq b;
    private final /* synthetic */ fhu c;

    public fic(fhu fhu, atzq atzq, auac auac) {
        this.c = fhu;
        this.b = (atzq) amqw.a((Object) atzq);
        this.a = auac;
    }

    public final void onClick(View view) {
        if (view.isSelected()) {
            this.c.a(auac.INDIFFERENT, this.b);
        } else {
            this.c.a(this.a, this.b);
        }
    }
}
