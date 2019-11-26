package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.google.android.youtube.R;

/* renamed from: aics */
public final class aics {
    private Drawable a;
    private final aicr b;
    private final aicr c;
    private aich d;
    private final ImageView e;
    private final Context f;

    public aics(ImageView imageView, Context context) {
        this.f = (Context) amqw.a((Object) context);
        this.e = (ImageView) amqw.a((Object) imageView);
        this.b = new aicr(imageView, R.drawable.player_play_pause_transition, R.drawable.player_pause);
        this.c = new aicr(imageView, R.drawable.player_pause_play_transition, R.drawable.player_play);
    }

    public final void a(aich aich) {
        Object obj;
        amqw.a(this.e);
        amqw.a(this.c);
        amqw.a(this.b);
        Drawable drawable = this.e.getDrawable();
        aich aich2 = this.d;
        Object obj2 = null;
        if (aich2 == null || aich == null || aich.a != aich2.a) {
            obj = null;
        } else {
            obj = 1;
        }
        if (drawable != null && drawable.isVisible()) {
            obj2 = 1;
        }
        if (aich == null) {
            return;
        }
        if (obj == null || obj2 == null) {
            aich aich3;
            if (aich.a == aicj.PAUSED) {
                this.e.setContentDescription(this.f.getText(R.string.accessibility_play));
                aich3 = this.d;
                if (aich3 != null && aich3.a == aicj.PLAYING) {
                    this.c.a();
                } else {
                    this.c.b();
                }
            } else if (aich.a == aicj.PLAYING) {
                this.e.setContentDescription(this.f.getText(R.string.accessibility_pause));
                aich3 = this.d;
                if (aich3 != null && aich3.a == aicj.PAUSED) {
                    this.b.a();
                } else {
                    this.b.b();
                }
            } else {
                this.e.setContentDescription(this.f.getText(R.string.accessibility_replay));
                ImageView imageView = this.e;
                if (this.a == null) {
                    this.a = ra.a(this.f, (int) R.drawable.player_replay);
                }
                imageView.setImageDrawable(this.a);
            }
            this.d = aich;
        }
    }
}
