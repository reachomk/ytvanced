package defpackage;

import android.content.Context;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

/* renamed from: xnj */
public class xnj extends xna {
    private final Context a;
    private Animation b;

    public xnj(Context context) {
        this.a = (Context) amqw.a((Object) context);
    }

    public boolean a() {
        return true;
    }

    public Animation b() {
        if (this.b == null) {
            this.b = AnimationUtils.loadAnimation(this.a, 17432576);
            this.b.setDuration((long) this.a.getResources().getInteger(17694720));
        }
        return this.b;
    }
}
