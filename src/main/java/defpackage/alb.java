package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import com.google.android.youtube.R;

/* renamed from: alb */
final class alb implements aqr {
    private final int[] a = new int[]{R.drawable.abc_textfield_search_default_mtrl_alpha, R.drawable.abc_textfield_default_mtrl_alpha, R.drawable.abc_ab_share_pack_mtrl_alpha};
    private final int[] b = new int[]{R.drawable.abc_ic_commit_search_api_mtrl_alpha, R.drawable.abc_seekbar_tick_mark_material, R.drawable.abc_ic_menu_share_mtrl_alpha, R.drawable.abc_ic_menu_copy_mtrl_am_alpha, R.drawable.abc_ic_menu_cut_mtrl_alpha, R.drawable.abc_ic_menu_selectall_mtrl_alpha, R.drawable.abc_ic_menu_paste_mtrl_am_alpha};
    private final int[] c = new int[]{R.drawable.abc_textfield_activated_mtrl_alpha, R.drawable.abc_textfield_search_activated_mtrl_alpha, R.drawable.abc_cab_background_top_mtrl_alpha, R.drawable.abc_text_cursor_material, R.drawable.abc_text_select_handle_left_mtrl_dark, R.drawable.abc_text_select_handle_middle_mtrl_dark, R.drawable.abc_text_select_handle_right_mtrl_dark, R.drawable.abc_text_select_handle_left_mtrl_light, R.drawable.abc_text_select_handle_middle_mtrl_light, R.drawable.abc_text_select_handle_right_mtrl_light};
    private final int[] d = new int[]{R.drawable.abc_popup_background_mtrl_mult, R.drawable.abc_cab_background_internal_bg, R.drawable.abc_menu_hardkey_panel_mtrl_mult};
    private final int[] e = new int[]{R.drawable.abc_tab_indicator_material, R.drawable.abc_textfield_search_material};
    private final int[] f = new int[]{R.drawable.abc_btn_check_material, R.drawable.abc_btn_radio_material, R.drawable.abc_btn_check_material_anim, R.drawable.abc_btn_radio_material_anim};

    alb() {
    }

    private static ColorStateList b(Context context, int i) {
        r1 = new int[4][];
        r0 = new int[4];
        int a = art.a(context, R.attr.colorControlHighlight);
        int c = art.c(context, R.attr.colorButtonNormal);
        r1[0] = art.a;
        r0[0] = c;
        r1[1] = art.c;
        r0[1] = sc.a(a, i);
        r1[2] = art.b;
        r0[2] = sc.a(a, i);
        r1[3] = art.e;
        r0[3] = i;
        return new ColorStateList(r1, r0);
    }

    public final Drawable a(aqk aqk, Context context, int i) {
        if (i != R.drawable.abc_cab_background_top_material) {
            return null;
        }
        return new LayerDrawable(new Drawable[]{aqk.a(context, (int) R.drawable.abc_cab_background_internal_bg), aqk.a(context, (int) R.drawable.abc_cab_background_top_mtrl_alpha)});
    }

    private static void a(Drawable drawable, int i, Mode mode) {
        if (amu.c(drawable)) {
            drawable = drawable.mutate();
        }
        if (mode == null) {
            mode = aky.a;
        }
        drawable.setColorFilter(aky.a(i, mode));
    }

    public final boolean a(Context context, int i, Drawable drawable) {
        LayerDrawable layerDrawable;
        if (i == R.drawable.abc_seekbar_track_material) {
            layerDrawable = (LayerDrawable) drawable;
            alb.a(layerDrawable.findDrawableByLayerId(16908288), art.a(context, R.attr.colorControlNormal), aky.a);
            alb.a(layerDrawable.findDrawableByLayerId(16908303), art.a(context, R.attr.colorControlNormal), aky.a);
            alb.a(layerDrawable.findDrawableByLayerId(16908301), art.a(context, R.attr.colorControlActivated), aky.a);
            return true;
        } else if (i != R.drawable.abc_ratingbar_material && i != R.drawable.abc_ratingbar_indicator_material && i != R.drawable.abc_ratingbar_small_material) {
            return false;
        } else {
            layerDrawable = (LayerDrawable) drawable;
            alb.a(layerDrawable.findDrawableByLayerId(16908288), art.c(context, R.attr.colorControlNormal), aky.a);
            alb.a(layerDrawable.findDrawableByLayerId(16908303), art.a(context, R.attr.colorControlActivated), aky.a);
            alb.a(layerDrawable.findDrawableByLayerId(16908301), art.a(context, R.attr.colorControlActivated), aky.a);
            return true;
        }
    }

    private static boolean a(int[] iArr, int i) {
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    public final ColorStateList a(Context context, int i) {
        if (i == R.drawable.abc_edit_text_material) {
            return agb.a(context, R.color.abc_tint_edittext);
        }
        if (i == R.drawable.abc_switch_track_mtrl_alpha) {
            return agb.a(context, R.color.abc_tint_switch_track);
        }
        if (i == R.drawable.abc_switch_thumb_material) {
            int[][] iArr = new int[3][];
            int[] iArr2 = new int[3];
            ColorStateList b = art.b(context, R.attr.colorSwitchThumbNormal);
            if (b == null || !b.isStateful()) {
                iArr[0] = art.a;
                iArr2[0] = art.c(context, R.attr.colorSwitchThumbNormal);
                iArr[1] = art.d;
                iArr2[1] = art.a(context, R.attr.colorControlActivated);
                iArr[2] = art.e;
                iArr2[2] = art.a(context, R.attr.colorSwitchThumbNormal);
            } else {
                int[] iArr3 = art.a;
                iArr[0] = iArr3;
                iArr2[0] = b.getColorForState(iArr3, 0);
                iArr[1] = art.d;
                iArr2[1] = art.a(context, R.attr.colorControlActivated);
                iArr[2] = art.e;
                iArr2[2] = b.getDefaultColor();
            }
            return new ColorStateList(iArr, iArr2);
        } else if (i == R.drawable.abc_btn_default_mtrl_shape) {
            return alb.b(context, art.a(context, R.attr.colorButtonNormal));
        } else {
            if (i == R.drawable.abc_btn_borderless_material) {
                return alb.b(context, 0);
            }
            if (i == R.drawable.abc_btn_colored_material) {
                return alb.b(context, art.a(context, R.attr.colorAccent));
            }
            if (i == R.drawable.abc_spinner_mtrl_am_alpha || i == R.drawable.abc_spinner_textfield_background_material) {
                return agb.a(context, R.color.abc_tint_spinner);
            }
            if (alb.a(this.b, i)) {
                return art.b(context, R.attr.colorControlNormal);
            }
            if (alb.a(this.e, i)) {
                return agb.a(context, R.color.abc_tint_default);
            }
            if (alb.a(this.f, i)) {
                return agb.a(context, R.color.abc_tint_btn_checkable);
            }
            if (i == R.drawable.abc_seekbar_thumb_material) {
                return agb.a(context, R.color.abc_tint_seek_thumb);
            }
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0065 A:{RETURN} */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004a  */
    public final boolean b(android.content.Context r7, int r8, android.graphics.drawable.Drawable r9) {
        /*
        r6 = this;
        r0 = defpackage.aky.a;
        r1 = r6.a;
        r1 = defpackage.alb.a(r1, r8);
        r2 = 16842801; // 0x1010031 float:2.3693695E-38 double:8.3214494E-317;
        r3 = 0;
        r4 = 1;
        r5 = -1;
        if (r1 == 0) goto L_0x0016;
    L_0x0010:
        r2 = 2130772517; // 0x7f010225 float:1.7148155E38 double:1.0527414998E-314;
    L_0x0013:
        r8 = 1;
        r1 = -1;
        goto L_0x0048;
    L_0x0016:
        r1 = r6.c;
        r1 = defpackage.alb.a(r1, r8);
        if (r1 != 0) goto L_0x0044;
    L_0x001e:
        r1 = r6.d;
        r1 = defpackage.alb.a(r1, r8);
        if (r1 == 0) goto L_0x0029;
    L_0x0026:
        r0 = android.graphics.PorterDuff.Mode.MULTIPLY;
        goto L_0x0013;
    L_0x0029:
        r1 = 2130837549; // 0x7f02002d float:1.7280055E38 double:1.05277363E-314;
        if (r8 != r1) goto L_0x003b;
    L_0x002e:
        r8 = 1109603123; // 0x42233333 float:40.8 double:5.482167836E-315;
        r8 = java.lang.Math.round(r8);
        r2 = 16842800; // 0x1010030 float:2.3693693E-38 double:8.321449E-317;
        r1 = r8;
        r8 = 1;
        goto L_0x0048;
    L_0x003b:
        r1 = 2130837525; // 0x7f020015 float:1.7280007E38 double:1.052773618E-314;
        if (r8 == r1) goto L_0x0013;
    L_0x0040:
        r8 = 0;
        r1 = -1;
        r2 = 0;
        goto L_0x0048;
    L_0x0044:
        r2 = 2130772518; // 0x7f010226 float:1.7148157E38 double:1.0527415E-314;
        goto L_0x0013;
    L_0x0048:
        if (r8 == 0) goto L_0x0065;
    L_0x004a:
        r8 = defpackage.amu.c(r9);
        if (r8 == 0) goto L_0x0054;
    L_0x0050:
        r9 = r9.mutate();
    L_0x0054:
        r7 = defpackage.art.a(r7, r2);
        r7 = defpackage.aky.a(r7, r0);
        r9.setColorFilter(r7);
        if (r1 == r5) goto L_0x0064;
    L_0x0061:
        r9.setAlpha(r1);
    L_0x0064:
        return r4;
    L_0x0065:
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.alb.b(android.content.Context, int, android.graphics.drawable.Drawable):boolean");
    }

    public final Mode a(int i) {
        return i != R.drawable.abc_switch_thumb_material ? null : Mode.MULTIPLY;
    }
}
