package com.google.android.apps.youtube.app.common.ui.playlist;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.Spinner;
import com.google.android.youtube.R;
import defpackage.amqw;
import defpackage.awnx;
import defpackage.fln;
import defpackage.flr;
import defpackage.fpa;
import defpackage.xpr;
import java.util.HashMap;
import java.util.Map;

public class PrivacySpinner extends Spinner {
    private static final Map d;
    private static final Map e;
    private static final Map f;
    public final LayoutInflater a;
    public Map b;
    public AlertDialog c;

    public PrivacySpinner(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = LayoutInflater.from(context);
        a(flr.EDIT);
    }

    public final void a(flr flr) {
        amqw.a((Object) flr);
        int ordinal = flr.ordinal();
        if (ordinal == 0) {
            this.b = d;
        } else if (ordinal == 1) {
            this.b = e;
        } else if (ordinal == 2) {
            this.b = f;
        }
        setAdapter(new fln(this));
    }

    public final void a(fpa fpa) {
        amqw.a((Object) fpa);
        setSelection(fpa.ordinal());
    }

    public final void a(awnx awnx) {
        int ordinal = awnx.ordinal();
        if (ordinal == 0) {
            a(fpa.PRIVATE);
        } else if (ordinal == 1) {
            a(fpa.PUBLIC);
        } else if (ordinal == 2) {
            a(fpa.UNLISTED);
        } else {
            String valueOf = String.valueOf(awnx);
            StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 24);
            stringBuilder.append("Unknown privacy status: ");
            stringBuilder.append(valueOf);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
    }

    public final fpa a() {
        return (fpa) getSelectedItem();
    }

    public final awnx b() {
        fpa a = a();
        int ordinal = a.ordinal();
        if (ordinal == 0) {
            return awnx.PUBLIC;
        }
        if (ordinal == 1) {
            return awnx.UNLISTED;
        }
        if (ordinal == 2) {
            return awnx.PRIVATE;
        }
        String valueOf = String.valueOf(a);
        StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 24);
        stringBuilder.append("Unknown privacy status: ");
        stringBuilder.append(valueOf);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    /* Access modifiers changed, original: protected|final */
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) getLayoutParams();
        setDropDownWidth((i - marginLayoutParams.leftMargin) - marginLayoutParams.rightMargin);
    }

    public final boolean performClick() {
        AlertDialog alertDialog = this.c;
        if (alertDialog != null) {
            xpr.a(alertDialog.getCurrentFocus());
        } else {
            xpr.a((Activity) getContext());
        }
        return super.performClick();
    }

    static {
        HashMap hashMap = new HashMap();
        d = hashMap;
        hashMap.put(fpa.PRIVATE, Integer.valueOf(R.string.video_privacy_private_description));
        Map map = d;
        fpa fpa = fpa.PUBLIC;
        Integer valueOf = Integer.valueOf(R.string.video_privacy_public_description);
        map.put(fpa, valueOf);
        map = d;
        fpa = fpa.UNLISTED;
        Integer valueOf2 = Integer.valueOf(R.string.video_privacy_unlisted_description);
        map.put(fpa, valueOf2);
        hashMap = new HashMap();
        e = hashMap;
        hashMap.put(fpa.PRIVATE, Integer.valueOf(R.string.video_privacy_upload_private_description));
        e.put(fpa.PUBLIC, valueOf);
        e.put(fpa.UNLISTED, valueOf2);
        hashMap = new HashMap();
        f = hashMap;
        hashMap.put(fpa.PRIVATE, Integer.valueOf(R.string.playlist_privacy_private_description));
        f.put(fpa.PUBLIC, Integer.valueOf(R.string.playlist_privacy_public_description));
        f.put(fpa.UNLISTED, Integer.valueOf(R.string.playlist_privacy_unlisted_description));
    }
}
