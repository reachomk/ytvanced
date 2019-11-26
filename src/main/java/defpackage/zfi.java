package defpackage;

import android.content.Context;
import android.widget.Toast;
import com.google.android.youtube.R;
import java.util.Observable;

/* renamed from: zfi */
public final class zfi extends Observable implements nlu {
    public final acvx a;
    public nlp b;
    private final Context c;
    private final boolean d;
    private zet e;

    public zfi(Context context, acvx acvx, boolean z) {
        nlp a = nlr.a(1, 5000, 5000);
        this.c = context;
        this.a = acvx;
        this.d = z;
        this.b = a;
        a.a((nlu) this);
        acvx acvx2 = this.a;
        if (acvx2 != null) {
            acvx2.b(acwc.UPLOAD_VIDEO_EDITING_VIDEO_AUDIO_SWAP_TRACK_STOP_PREVIEW_BUTTON, null);
            this.a.b(acwc.UPLOAD_VIDEO_EDITING_VIDEO_AUDIO_SWAP_TRACK_START_PREVIEW_BUTTON, null);
            this.a.b(acwc.UPLOAD_VIDEO_EDITING_VIDEO_AUDIO_SWAP_TRACK_PREVIEW_ERROR, null);
        }
    }

    public final void a() {
    }

    public final boolean a(zet zet) {
        return amqq.a(this.e, amqw.a((Object) zet)) && this.b.b() != 5;
    }

    public final void a(boolean z) {
        if (b(null) && z) {
            acvx acvx = this.a;
            if (acvx != null && acvx.c() != null) {
                this.a.a(3, new acvs(acwc.UPLOAD_VIDEO_EDITING_VIDEO_AUDIO_SWAP_TRACK_STOP_PREVIEW_BUTTON), null);
            }
        }
    }

    public final void a(boolean z, int i) {
        if (i == 5) {
            b(null);
        }
    }

    public final void a(nlq nlq) {
        Toast.makeText(this.c, R.string.upload_edit_audio_swap_preview_error, 0).show();
        acvx acvx = this.a;
        if (!(acvx == null || acvx.c() == null)) {
            this.a.a(new acvs(acwc.UPLOAD_VIDEO_EDITING_VIDEO_AUDIO_SWAP_TRACK_PREVIEW_ERROR), null);
        }
        b(null);
    }

    public final boolean b(zet zet) {
        if (amqq.a(this.e, zet)) {
            return false;
        }
        this.e = zet;
        this.b.f();
        zet = this.e;
        if (zet != null) {
            nne nly;
            if (this.d) {
                nne nrd = new nrd(this.e.d, new nvr(this.c, nxf.a(this.c, "AudioMPEG")), new nvp(65536), 1310720, new nrc[0]);
            } else {
                nly = new nly(this.c, zet.d);
            }
            nlz nlz = new nlz(nly, nmg.a);
            this.b.a(nlz);
            this.b.a(0);
            this.b.a(true);
        }
        setChanged();
        notifyObservers(this);
        return true;
    }
}
