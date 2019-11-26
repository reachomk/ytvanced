package defpackage;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.youtube.R;

/* renamed from: zff */
public final class zff {
    public final akle a;
    public AlertDialog b;

    public zff(Context context, akkl akkl, zet zet, Runnable runnable, Runnable runnable2) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.audio_swap_track_change_dialog, null);
        ((YouTubeTextView) inflate.findViewById(R.id.audio_swap_track_title)).setText(zet.a);
        ((YouTubeTextView) inflate.findViewById(R.id.audio_swap_track_artist)).setText(zet.b);
        ((YouTubeTextView) inflate.findViewById(R.id.audio_swap_track_duration)).setText(uix.a(context, (long) zet.c, false));
        if (zet.f != null) {
            ((YouTubeTextView) inflate.findViewById(R.id.audio_swap_track_category_name)).setText(zet.f);
        }
        this.a = new akle(akkl, (ImageView) inflate.findViewById(R.id.audio_swap_track_cover));
        this.a.a();
        aygk aygk = zet.e;
        if (aygk != null) {
            this.a.a(aygk, new zfj(this));
        } else {
            this.a.b(R.drawable.audio_swap_track_not_loaded);
        }
        this.a.a(ScaleType.CENTER_CROP);
        this.b = new Builder(context).setCancelable(true).setPositiveButton(R.string.upload_edit_audio_swap_dialog_change_track, new zfh(runnable)).setNegativeButton(R.string.upload_edit_audio_swap_dialog_remove_track, new zfe(runnable2)).setView(inflate).create();
        inflate.findViewById(R.id.audio_swap_change_dialog_close_button).setOnClickListener(new zfg(this));
    }
}
