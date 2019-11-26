package defpackage;

import android.content.res.AssetFileDescriptor;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Movie;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import java.io.InputStream;

/* renamed from: aqt */
class aqt extends Resources {
    private final Resources a;

    public aqt(Resources resources) {
        super(resources.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
        this.a = resources;
    }

    public final CharSequence getText(int i) {
        return this.a.getText(i);
    }

    public final CharSequence getQuantityText(int i, int i2) {
        return this.a.getQuantityText(i, i2);
    }

    public final String getString(int i) {
        return this.a.getString(i);
    }

    public final String getString(int i, Object... objArr) {
        return this.a.getString(i, objArr);
    }

    public final String getQuantityString(int i, int i2, Object... objArr) {
        return this.a.getQuantityString(i, i2, objArr);
    }

    public final String getQuantityString(int i, int i2) {
        return this.a.getQuantityString(i, i2);
    }

    public final CharSequence getText(int i, CharSequence charSequence) {
        return this.a.getText(i, charSequence);
    }

    public final CharSequence[] getTextArray(int i) {
        return this.a.getTextArray(i);
    }

    public final String[] getStringArray(int i) {
        return this.a.getStringArray(i);
    }

    public final int[] getIntArray(int i) {
        return this.a.getIntArray(i);
    }

    public final TypedArray obtainTypedArray(int i) {
        return this.a.obtainTypedArray(i);
    }

    public final float getDimension(int i) {
        return this.a.getDimension(i);
    }

    public final int getDimensionPixelOffset(int i) {
        return this.a.getDimensionPixelOffset(i);
    }

    public final int getDimensionPixelSize(int i) {
        return this.a.getDimensionPixelSize(i);
    }

    public final float getFraction(int i, int i2, int i3) {
        return this.a.getFraction(i, i2, i3);
    }

    public Drawable getDrawable(int i) {
        return this.a.getDrawable(i);
    }

    public final Drawable getDrawable(int i, Theme theme) {
        return this.a.getDrawable(i, theme);
    }

    public final Drawable getDrawableForDensity(int i, int i2) {
        return this.a.getDrawableForDensity(i, i2);
    }

    public final Drawable getDrawableForDensity(int i, int i2, Theme theme) {
        return this.a.getDrawableForDensity(i, i2, theme);
    }

    public final Movie getMovie(int i) {
        return this.a.getMovie(i);
    }

    public final int getColor(int i) {
        return this.a.getColor(i);
    }

    public final ColorStateList getColorStateList(int i) {
        return this.a.getColorStateList(i);
    }

    public final boolean getBoolean(int i) {
        return this.a.getBoolean(i);
    }

    public final int getInteger(int i) {
        return this.a.getInteger(i);
    }

    public final XmlResourceParser getLayout(int i) {
        return this.a.getLayout(i);
    }

    public final XmlResourceParser getAnimation(int i) {
        return this.a.getAnimation(i);
    }

    public final XmlResourceParser getXml(int i) {
        return this.a.getXml(i);
    }

    public final InputStream openRawResource(int i) {
        return this.a.openRawResource(i);
    }

    public final InputStream openRawResource(int i, TypedValue typedValue) {
        return this.a.openRawResource(i, typedValue);
    }

    public final AssetFileDescriptor openRawResourceFd(int i) {
        return this.a.openRawResourceFd(i);
    }

    public final void getValue(int i, TypedValue typedValue, boolean z) {
        this.a.getValue(i, typedValue, z);
    }

    public final void getValueForDensity(int i, int i2, TypedValue typedValue, boolean z) {
        this.a.getValueForDensity(i, i2, typedValue, z);
    }

    public final void getValue(String str, TypedValue typedValue, boolean z) {
        this.a.getValue(str, typedValue, z);
    }

    public final TypedArray obtainAttributes(AttributeSet attributeSet, int[] iArr) {
        return this.a.obtainAttributes(attributeSet, iArr);
    }

    public final void updateConfiguration(Configuration configuration, DisplayMetrics displayMetrics) {
        super.updateConfiguration(configuration, displayMetrics);
        Resources resources = this.a;
        if (resources != null) {
            resources.updateConfiguration(configuration, displayMetrics);
        }
    }

    public final DisplayMetrics getDisplayMetrics() {
        return this.a.getDisplayMetrics();
    }

    public final Configuration getConfiguration() {
        return this.a.getConfiguration();
    }

    public final int getIdentifier(String str, String str2, String str3) {
        return this.a.getIdentifier(str, str2, str3);
    }

    public final String getResourceName(int i) {
        return this.a.getResourceName(i);
    }

    public final String getResourcePackageName(int i) {
        return this.a.getResourcePackageName(i);
    }

    public final String getResourceTypeName(int i) {
        return this.a.getResourceTypeName(i);
    }

    public final String getResourceEntryName(int i) {
        return this.a.getResourceEntryName(i);
    }

    public final void parseBundleExtras(XmlResourceParser xmlResourceParser, Bundle bundle) {
        this.a.parseBundleExtras(xmlResourceParser, bundle);
    }

    public final void parseBundleExtra(String str, AttributeSet attributeSet, Bundle bundle) {
        this.a.parseBundleExtra(str, attributeSet, bundle);
    }
}
