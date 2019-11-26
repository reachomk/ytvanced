package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Message;
import android.os.RemoteException;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.apps.youtube.embeddedplayer.service.jar.MutedAutoplayIndicator;
import com.google.android.apps.youtube.embeddedplayer.service.service.jar.ISelectableItemRegistryService;
import com.google.android.libraries.youtube.common.ui.TouchImageView;
import com.google.android.youtube.R;
import java.lang.ref.WeakReference;

/* renamed from: mui */
public final class mui extends aiua implements Callback, OnClickListener {
    public final MutedAutoplayIndicator a;
    public final TouchImageView b;
    public final RelativeLayout c;
    public final TextView d;
    public final muc e;
    public final Handler f = new Handler(this);
    public nhh g;
    public nhh h;
    public nhh i;
    public WeakReference j;
    public long k;
    private final OnClickListener l;

    public mui(Context context, OnClickListener onClickListener, bctz bctz) {
        super(context);
        LayoutInflater.from(context).inflate(R.layout.muted_autoplay_overlay, this);
        this.l = (OnClickListener) amqw.a((Object) onClickListener);
        this.a = (MutedAutoplayIndicator) findViewById(R.id.audio_indicator);
        this.c = (RelativeLayout) findViewById(R.id.end_screen_layout);
        this.d = (TextView) findViewById(R.id.end_screen_text);
        this.b = (TouchImageView) findViewById(R.id.api_youtube_watermark);
        this.e = new muc((TouchImageView) findViewById(R.id.end_screen_play_button));
        setOnClickListener(this);
        this.c.setOnClickListener(this);
        this.b.setOnClickListener(this);
        bctz.c().a(new mul(this));
    }

    public final void onClick(View view) {
        ISelectableItemRegistryService iSelectableItemRegistryService = (ISelectableItemRegistryService) this.j.get();
        if (iSelectableItemRegistryService != null) {
            nhh nhh;
            if (view == this.c) {
                nhh = this.h;
            } else if (view == this.b) {
                nhh = this.i;
            } else {
                nhh = this.g;
            }
            if (nhh != null) {
                try {
                    iSelectableItemRegistryService.a(nhh);
                } catch (RemoteException unused) {
                }
                this.l.onClick(view);
            }
        }
    }

    public final LayoutParams b() {
        return new LayoutParams(-1, -1);
    }

    public final boolean handleMessage(Message message) {
        if (message.what != 1) {
            return false;
        }
        xpr.a(this.b, false);
        return true;
    }
}
