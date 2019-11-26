package defpackage;

import android.content.Context;
import android.widget.ImageView;
import com.google.android.youtube.R;

/* renamed from: hdv */
public final class hdv {
    private ImageView a;
    private final Context b;

    public hdv(Context context) {
        this.b = (Context) amqw.a((Object) context);
    }

    public final void a(ImageView imageView) {
        this.a = (ImageView) amqw.a((Object) imageView);
    }

    /* Access modifiers changed, original: final */
    public final void a(aich aich, boolean z) {
        amqw.a(this.a);
        int ordinal = aich.a.ordinal();
        if (ordinal == 1) {
            this.a.setContentDescription(this.b.getText(R.string.accessibility_pause));
            this.a.setImageResource(R.drawable.quantum_ic_pause_white_48);
        } else if (ordinal == 2) {
            this.a.setContentDescription(this.b.getText(R.string.accessibility_play));
            this.a.setImageResource(R.drawable.quantum_ic_play_arrow_white_48);
        } else if (z) {
            this.a.setContentDescription(this.b.getText(R.string.playback_control_stop));
            this.a.setImageResource(R.drawable.quantum_ic_stop_white_48);
        } else {
            this.a.setContentDescription(this.b.getText(R.string.accessibility_replay));
            this.a.setImageResource(R.drawable.quantum_ic_replay_white_48);
        }
    }
}
