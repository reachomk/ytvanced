package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.Observable;
import java.util.Observer;

/* renamed from: zga */
public class zga extends RelativeLayout implements OnClickListener, Observer {
    public final ImageView a;
    public final TextView b;
    public final TextView c;
    public final TextView d;
    public final TextView e;
    public akle f;
    public zfz g;
    public zet h;
    private final View i;
    private final ImageView j;
    private final View k;
    private final View l;
    private final zfi m;

    protected zga(Context context, zfi zfi, akkl akkl, int i) {
        super(context);
        this.m = zfi;
        View inflate = LayoutInflater.from(context).inflate(i, this, true);
        inflate.setWillNotDraw(false);
        this.i = inflate.findViewById(R.id.audio_swap_track_preview);
        this.j = (ImageView) inflate.findViewById(R.id.audio_swap_track_play_button);
        this.b = (TextView) inflate.findViewById(R.id.audio_swap_track_title);
        this.c = (TextView) inflate.findViewById(R.id.audio_swap_track_artist);
        this.d = (TextView) inflate.findViewById(R.id.audio_swap_track_duration);
        this.e = (TextView) inflate.findViewById(R.id.audio_swap_track_category_name);
        this.l = inflate.findViewById(R.id.audio_swap_track_track_info);
        this.k = inflate.findViewById(R.id.audio_swap_track_add_button);
        this.i.setOnClickListener(this);
        this.l.setOnClickListener(this);
        this.k.setOnClickListener(this);
        this.a = (ImageView) inflate.findViewById(R.id.audio_swap_track_cover);
        ImageView imageView = this.a;
        if (imageView != null) {
            this.f = new akle(akkl, imageView);
            this.g = new zfz(this);
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.m.addObserver(this);
    }

    /* Access modifiers changed, original: protected|final */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.m.deleteObserver(this);
    }

    public final void onClick(View view) {
        if (view == this.i || view == this.l) {
            if (this.m.a(this.h)) {
                this.m.a(true);
                return;
            }
            zfi zfi = this.m;
            if (zfi.b((zet) amqw.a(this.h))) {
                acvx acvx = zfi.a;
                if (!(acvx == null || acvx.c() == null)) {
                    zfi.a.a(3, new acvs(acwc.UPLOAD_VIDEO_EDITING_VIDEO_AUDIO_SWAP_TRACK_START_PREVIEW_BUTTON), null);
                }
            }
        } else if (view == this.k && this.h != null) {
            ((zfx) getContext()).a(this.h);
        }
    }

    public final void update(Observable observable, Object obj) {
        if (observable == this.m) {
            a();
        }
    }

    public final void a() {
        this.j.setBackgroundResource(!this.m.a(this.h) ? R.drawable.audio_swap_play_button : R.drawable.audio_swap_stop_button);
    }
}
