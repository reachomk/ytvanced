package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.OnSharedPreferenceChangeListener;
import android.graphics.Color;
import android.graphics.Typeface;
import android.preference.PreferenceManager;
import android.view.accessibility.CaptioningManager;
import android.view.accessibility.CaptioningManager.CaptionStyle;
import com.google.android.youtube.R;
import java.util.HashMap;
import java.util.Map;

/* renamed from: sct */
public final class sct implements OnSharedPreferenceChangeListener {
    private static final Map d = new HashMap();
    private static final Map e = new HashMap();
    private static final Map f = new HashMap();
    public final Context a;
    public final sde b;
    private final SharedPreferences c = PreferenceManager.getDefaultSharedPreferences(this.a);

    public sct(Context context) {
        this.a = context;
        this.c.registerOnSharedPreferenceChangeListener(this);
        this.b = sap.o().i;
    }

    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
    }

    public final pkl a() {
        boolean isItalic;
        Context context = this.a;
        pkl pkl = new pkl();
        CaptioningManager captioningManager = (CaptioningManager) context.getSystemService("captioning");
        pkl.a = captioningManager.getFontScale();
        CaptionStyle userStyle = captioningManager.getUserStyle();
        pkl.c = userStyle.backgroundColor;
        pkl.b = userStyle.foregroundColor;
        int i = userStyle.edgeType;
        int i2 = 0;
        if (i == 1) {
            pkl.a(1);
        } else if (i != 2) {
            pkl.a(0);
        } else {
            pkl.a(2);
        }
        pkl.e = userStyle.edgeColor;
        Typeface typeface = userStyle.getTypeface();
        if (typeface != null) {
            if (Typeface.MONOSPACE.equals(typeface)) {
                pkl.b(1);
            } else if (Typeface.SANS_SERIF.equals(typeface) || !Typeface.SERIF.equals(typeface)) {
                pkl.b(0);
            } else {
                pkl.b(2);
            }
            boolean isBold = typeface.isBold();
            isItalic = typeface.isItalic();
            if (isBold && isItalic) {
                pkl.k = 3;
            } else if (isBold) {
                pkl.k = 1;
            } else if (isItalic) {
                pkl.k = 2;
            } else {
                pkl.k = 0;
            }
        }
        if (!sdh.a) {
            pkl.b(((Integer) e.get(this.b.b(this.a.getString(R.string.ccl_key_caption_font_family), "FONT_FAMILY_SANS_SERIF"))).intValue());
            pkl.c = Color.parseColor(c());
            pkl.a(((Integer) f.get(b())).intValue());
            pkl.a = Float.parseFloat(this.b.b(this.a.getString(R.string.ccl_key_caption_font_scale), String.valueOf(1.0f)));
            isItalic = Typeface.DEFAULT.isBold();
            boolean isItalic2 = Typeface.DEFAULT.isItalic();
            if (isItalic && isItalic2) {
                i2 = 3;
            } else if ((isItalic || isItalic2) && isItalic) {
                i2 = 1;
            }
            pkl.k = i2;
            pkl.b = sct.a(this.b.b(this.a.getString(R.string.ccl_key_caption_text_color), this.a.getString(R.string.ccl_prefs_caption_text_color_value_default)), this.b.b(this.a.getString(R.string.ccl_key_caption_text_opacity), this.a.getString(R.string.ccl_prefs_caption_text_opacity_value_default)));
            String valueOf = String.valueOf(b());
            String str = "Edge is: ";
            if (valueOf.length() == 0) {
                valueOf = new String(str);
            } else {
                str.concat(valueOf);
            }
            pkl.c = sct.a(c(), this.b.b(this.a.getString(R.string.ccl_key_caption_background_opacity), this.a.getString(R.string.ccl_prefs_caption_background_opacity_value_default)));
        }
        return pkl;
    }

    private final String b() {
        return this.b.b(this.a.getString(R.string.ccl_key_caption_edge_type), "EDGE_TYPE_NONE");
    }

    private final String c() {
        return this.b.b(this.a.getString(R.string.ccl_key_caption_background_color), this.a.getString(R.string.ccl_prefs_caption_background_color_value_default));
    }

    private static int a(String str, String str2) {
        String str3 = "#";
        str = str.replace(str3, "");
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(str2).length() + 1) + String.valueOf(str).length());
        stringBuilder.append(str3);
        stringBuilder.append(str2);
        stringBuilder.append(str);
        return Color.parseColor(stringBuilder.toString());
    }

    static {
        sdf.a(sct.class);
        d.put("FF", "100");
        d.put("BF", "75");
        d.put("80", "50");
        d.put("3F", "25");
        Map map = e;
        Integer valueOf = Integer.valueOf(0);
        map.put("FONT_FAMILY_SANS_SERIF", valueOf);
        map = e;
        Integer valueOf2 = Integer.valueOf(2);
        map.put("FONT_FAMILY_SERIF", valueOf2);
        map = e;
        Integer valueOf3 = Integer.valueOf(1);
        map.put("FONT_FAMILY_MONOSPACED_SANS_SERIF", valueOf3);
        f.put("EDGE_TYPE_NONE", valueOf);
        f.put("EDGE_TYPE_OUTLINE", valueOf3);
        f.put("EDGE_TYPE_DROP_SHADOW", valueOf2);
    }
}
