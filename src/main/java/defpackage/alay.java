package defpackage;

import android.content.Context;
import com.google.android.youtube.R;

/* renamed from: alay */
public final class alay {
    private static final amur a;

    public static int a(Context context, ayem ayem) {
        if (a.containsKey(ayem)) {
            return xwe.a(context, ((Integer) a.get(ayem)).intValue(), 0);
        }
        return 0;
    }

    static {
        amuu amuu = new amuu();
        amuu.b(ayem.THEME_ATTRIBUTE_BACKGROUND1, Integer.valueOf(R.attr.ytBrandBackgroundSolid));
        amuu.b(ayem.THEME_ATTRIBUTE_BACKGROUND2, Integer.valueOf(R.attr.ytGeneralBackgroundA));
        amuu.b(ayem.THEME_ATTRIBUTE_BACKGROUND3, Integer.valueOf(R.attr.ytGeneralBackgroundB));
        amuu.b(ayem.THEME_ATTRIBUTE_SEPARATOR, Integer.valueOf(R.attr.ytSeparator));
        amuu.b(ayem.THEME_ATTRIBUTE_CHIP_BACKGROUND, Integer.valueOf(R.attr.ytChipBackground));
        amuu.b(ayem.THEME_ATTRIBUTE_TEXT1, Integer.valueOf(R.attr.ytTextPrimary));
        amuu.b(ayem.THEME_ATTRIBUTE_TEXT2, Integer.valueOf(R.attr.ytTextSecondary));
        ayem ayem = ayem.THEME_ATTRIBUTE_TEXT3;
        Integer valueOf = Integer.valueOf(R.attr.ytTextDisabled);
        amuu.b(ayem, valueOf);
        amuu.b(ayem.THEME_ATTRIBUTE_SELECTED_NAV_TEXT, Integer.valueOf(R.attr.ytSelectedNavText));
        amuu.b(ayem.THEME_ATTRIBUTE_BRAND_RED, Integer.valueOf(R.attr.ytBrandRed));
        amuu.b(ayem.THEME_ATTRIBUTE_STATIC_BLUE, Integer.valueOf(R.attr.ytStaticBlue));
        amuu.b(ayem.THEME_ATTRIBUTE_STATIC_YELLOW, Integer.valueOf(R.attr.ytStaticYellow));
        amuu.b(ayem.THEME_ATTRIBUTE_STATIC_GREEN, Integer.valueOf(R.attr.ytStaticGreen));
        amuu.b(ayem.THEME_ATTRIBUTE_STATIC_WHITE, Integer.valueOf(R.attr.ytStaticWhite));
        amuu.b(ayem.THEME_ATTRIBUTE_STATIC_GREY, Integer.valueOf(R.attr.ytStaticGrey));
        amuu.b(ayem.THEME_ATTRIBUTE_ICON1, Integer.valueOf(R.attr.ytIcon1));
        amuu.b(ayem.THEME_ATTRIBUTE_ICON2, Integer.valueOf(R.attr.ytIcon2));
        amuu.b(ayem.THEME_ATTRIBUTE_UNSELECTED_NAV_ICON, Integer.valueOf(R.attr.ytBrandIconInactive));
        amuu.b(ayem.THEME_ATTRIBUTE_SELECTED_NAV_ICON, Integer.valueOf(R.attr.ytBrandIconActive));
        amuu.b(ayem.THEME_ATTRIBUTE_HEADER_ICON, Integer.valueOf(R.attr.ytHeaderIcon));
        amuu.b(ayem.THEME_ATTRIBUTE_BADGE_BACKGROUND1, Integer.valueOf(R.attr.ytBadgeBackground1));
        amuu.b(ayem.THEME_ATTRIBUTE_BADGE_BACKGROUND2, Integer.valueOf(R.attr.ytBadgeBackground2));
        amuu.b(ayem.THEME_ATTRIBUTE_BADGE_TEXT1, Integer.valueOf(R.attr.ytBadgeText1));
        amuu.b(ayem.THEME_ATTRIBUTE_BADGE_TEXT2, Integer.valueOf(R.attr.ytBadgeText2));
        amuu.b(ayem.THEME_ATTRIBUTE_STATIC_DARK_BACKGROUND1, Integer.valueOf(R.attr.ytStaticDarkBackground1));
        amuu.b(ayem.THEME_ATTRIBUTE_AD_MUTED_BACKGROUND, Integer.valueOf(R.attr.adMutedBackground));
        amuu.b(ayem.THEME_ATTRIBUTE_AD_BLUE, Integer.valueOf(R.attr.adBlue));
        amuu.b(ayem.THEME_ATTRIBUTE_AD_BACKGROUND1, Integer.valueOf(R.attr.adBackground1));
        amuu.b(ayem.THEME_ATTRIBUTE_AD_BACKGROUND2, Integer.valueOf(R.attr.adBackground2));
        amuu.b(ayem.THEME_ATTRIBUTE_AD_OVERLAY_BACKGROUND, Integer.valueOf(R.attr.adOverlayBackground));
        amuu.b(ayem.THEME_ATTRIBUTE_AD_TEXT1, Integer.valueOf(R.attr.adText1));
        amuu.b(ayem.THEME_ATTRIBUTE_AD_TEXT2, Integer.valueOf(R.attr.adText2));
        amuu.b(ayem.THEME_ATTRIBUTE_AD_TEXT3, Integer.valueOf(R.attr.adText3));
        amuu.b(ayem.THEME_ATTRIBUTE_AD_TEXT4, Integer.valueOf(R.attr.adText4));
        amuu.b(ayem.THEME_ATTRIBUTE_AD_SEPARATOR1, Integer.valueOf(R.attr.adSeparator1));
        amuu.b(ayem.THEME_ATTRIBUTE_ICON_DISABLED, Integer.valueOf(R.attr.ytIconDisabled));
        amuu.b(ayem.THEME_ATTRIBUTE_TEXT_DISABLED, valueOf);
        amuu.b(ayem.THEME_ATTRIBUTE_ICON_INACTIVE, Integer.valueOf(R.attr.ytIconInactive));
        a = amuu.b();
    }
}
