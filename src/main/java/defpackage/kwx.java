package defpackage;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.CreatePlaylistEndpointOuterClass$CreatePlaylistEndpoint;

/* renamed from: kwx */
public final class kwx extends akpl {
    private final View a;
    private final TextView b = ((TextView) this.a.findViewById(R.id.title));
    private final ImageView c = ((ImageView) this.a.findViewById(R.id.icon));

    public kwx(Activity activity, ViewGroup viewGroup) {
        amqw.a((Object) activity);
        amqw.a((Object) viewGroup);
        this.a = activity.getLayoutInflater().inflate(R.layout.playlist_add_to_entry, viewGroup, false);
    }

    public final void a(akpb akpb) {
    }

    public final View K_() {
        return this.a;
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ void a(akor akor, Object obj) {
        arml arml;
        aphg aphg = (aphg) obj;
        if ((aphg.a & 128) != 0) {
            arml = aphg.g;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        this.b.setText(ajqy.a(arml));
        anxp anxp = aphg.m;
        if (anxp == null) {
            anxp = apxu.d;
        }
        anxr access$000 = anxl.checkIsLite(CreatePlaylistEndpointOuterClass$CreatePlaylistEndpoint.createPlaylistEndpoint);
        anxp.a(access$000);
        if (anxp.h.a(access$000.d)) {
            this.c.setImageResource(R.drawable.quantum_ic_playlist_add_grey600_24);
        } else {
            this.c.setImageResource(R.drawable.quantum_ic_playlist_play_grey600_24);
        }
    }
}
