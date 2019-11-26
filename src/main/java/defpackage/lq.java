package defpackage;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import android.graphics.drawable.Drawable.ConstantState;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: lq */
public final class lq extends ma implements Animatable {
    public lr a;
    public AnimatorListener b;
    public ArrayList c;
    public final Callback d;
    private Context f;
    private ArgbEvaluator g;

    lq() {
        this(null, (byte) 0);
    }

    private lq(Context context) {
        this(context, (byte) 0);
    }

    private lq(Context context, byte b) {
        this.g = null;
        this.b = null;
        this.c = null;
        this.d = new lp(this);
        this.f = context;
        this.a = new lr();
    }

    public final Drawable mutate() {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    public static lq a(Context context, int i) {
        String str = "parser error";
        String str2 = "AnimatedVDCompat";
        if (VERSION.SDK_INT >= 24) {
            lq lqVar = new lq(context);
            lqVar.e = rz.a(context.getResources(), i, context.getTheme());
            lqVar.e.setCallback(lqVar.d);
            lu luVar = new lu(lqVar.e.getConstantState());
            return lqVar;
        }
        try {
            XmlResourceParser xml = context.getResources().getXml(i);
            AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
            while (true) {
                int next = xml.next();
                if (next == 2) {
                    return lq.a(context, context.getResources(), xml, asAttributeSet, context.getTheme());
                }
                if (next == 1) {
                    throw new XmlPullParserException("No start tag found");
                }
            }
        } catch (XmlPullParserException e) {
            Log.e(str2, str, e);
            return null;
        } catch (IOException e2) {
            Log.e(str2, str, e2);
            return null;
        }
    }

    public static lq a(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) {
        lq lqVar = new lq(context);
        lqVar.inflate(resources, xmlPullParser, attributeSet, theme);
        return lqVar;
    }

    public final ConstantState getConstantState() {
        return (this.e == null || VERSION.SDK_INT < 24) ? null : new lu(this.e.getConstantState());
    }

    public final int getChangingConfigurations() {
        Drawable drawable = this.e;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        return super.getChangingConfigurations();
    }

    public final void draw(Canvas canvas) {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        this.a.a.draw(canvas);
        if (this.a.b.isStarted()) {
            invalidateSelf();
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.a.a.setBounds(rect);
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean onStateChange(int[] iArr) {
        Drawable drawable = this.e;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        return this.a.a.setState(iArr);
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean onLevelChange(int i) {
        Drawable drawable = this.e;
        if (drawable != null) {
            return drawable.setLevel(i);
        }
        return this.a.a.setLevel(i);
    }

    public final int getAlpha() {
        Drawable drawable = this.e;
        if (drawable == null) {
            return this.a.a.getAlpha();
        }
        return drawable.getAlpha();
    }

    public final void setAlpha(int i) {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else {
            this.a.a.setAlpha(i);
        }
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.a.a.setColorFilter(colorFilter);
        }
    }

    public final ColorFilter getColorFilter() {
        Drawable drawable = this.e;
        if (drawable != null) {
            return st.b(drawable);
        }
        return this.a.a.getColorFilter();
    }

    public final void setTint(int i) {
        Drawable drawable = this.e;
        if (drawable != null) {
            st.a(drawable, i);
        } else {
            this.a.a.setTint(i);
        }
    }

    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.e;
        if (drawable != null) {
            st.a(drawable, colorStateList);
        } else {
            this.a.a.setTintList(colorStateList);
        }
    }

    public final void setTintMode(Mode mode) {
        Drawable drawable = this.e;
        if (drawable != null) {
            st.a(drawable, mode);
        } else {
            this.a.a.setTintMode(mode);
        }
    }

    public final boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.e;
        if (drawable != null) {
            return drawable.setVisible(z, z2);
        }
        this.a.a.setVisible(z, z2);
        return super.setVisible(z, z2);
    }

    public final boolean isStateful() {
        Drawable drawable = this.e;
        if (drawable != null) {
            return drawable.isStateful();
        }
        return this.a.a.isStateful();
    }

    public final int getOpacity() {
        Drawable drawable = this.e;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return this.a.a.getOpacity();
    }

    public final int getIntrinsicWidth() {
        Drawable drawable = this.e;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return this.a.a.getIntrinsicWidth();
    }

    public final int getIntrinsicHeight() {
        Drawable drawable = this.e;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return this.a.a.getIntrinsicHeight();
    }

    public final boolean isAutoMirrored() {
        Drawable drawable = this.e;
        if (drawable == null) {
            return this.a.a.isAutoMirrored();
        }
        return drawable.isAutoMirrored();
    }

    public final void setAutoMirrored(boolean z) {
        Drawable drawable = this.e;
        if (drawable == null) {
            this.a.a.setAutoMirrored(z);
        } else {
            drawable.setAutoMirrored(z);
        }
    }

    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) {
        Drawable drawable = this.e;
        if (drawable != null) {
            st.a(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                TypedArray a;
                if ("animated-vector".equals(name)) {
                    a = sd.a(resources, theme, attributeSet, lm.e);
                    int resourceId = a.getResourceId(0, 0);
                    if (resourceId != 0) {
                        lz a2 = lz.a(resources, resourceId, theme);
                        a2.c = false;
                        a2.setCallback(this.d);
                        lz lzVar = this.a.a;
                        if (lzVar != null) {
                            lzVar.setCallback(null);
                        }
                        this.a.a = a2;
                    }
                    a.recycle();
                } else if ("target".equals(name)) {
                    a = resources.obtainAttributes(attributeSet, lm.f);
                    String string = a.getString(0);
                    int resourceId2 = a.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.f;
                        if (context != null) {
                            Animator loadAnimator;
                            if (VERSION.SDK_INT >= 24) {
                                loadAnimator = AnimatorInflater.loadAnimator(context, resourceId2);
                            } else {
                                loadAnimator = lw.a(context, context.getResources(), context.getTheme(), resourceId2);
                            }
                            loadAnimator.setTarget(this.a.a.b.b.k.get(string));
                            if (VERSION.SDK_INT < 21) {
                                a(loadAnimator);
                            }
                            lr lrVar = this.a;
                            if (lrVar.c == null) {
                                lrVar.c = new ArrayList();
                                this.a.d = new zj();
                            }
                            this.a.c.add(loadAnimator);
                            this.a.d.put(loadAnimator, string);
                        } else {
                            a.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                    }
                    a.recycle();
                } else {
                    continue;
                }
            }
            eventType = xmlPullParser.next();
        }
        lr lrVar2 = this.a;
        if (lrVar2.b == null) {
            lrVar2.b = new AnimatorSet();
        }
        lrVar2.b.playTogether(lrVar2.c);
    }

    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        inflate(resources, xmlPullParser, attributeSet, null);
    }

    public final void applyTheme(Theme theme) {
        Drawable drawable = this.e;
        if (drawable != null) {
            st.a(drawable, theme);
        }
    }

    public final boolean canApplyTheme() {
        Drawable drawable = this.e;
        if (drawable == null) {
            return false;
        }
        return st.a(drawable);
    }

    private final void a(Animator animator) {
        if (animator instanceof AnimatorSet) {
            ArrayList childAnimations = ((AnimatorSet) animator).getChildAnimations();
            if (childAnimations != null) {
                for (int i = 0; i < childAnimations.size(); i++) {
                    a((Animator) childAnimations.get(i));
                }
            }
        }
        if (animator instanceof ObjectAnimator) {
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            String propertyName = objectAnimator.getPropertyName();
            if ("fillColor".equals(propertyName) || "strokeColor".equals(propertyName)) {
                if (this.g == null) {
                    this.g = new ArgbEvaluator();
                }
                objectAnimator.setEvaluator(this.g);
            }
        }
    }

    public final boolean isRunning() {
        Drawable drawable = this.e;
        if (drawable != null) {
            return ((AnimatedVectorDrawable) drawable).isRunning();
        }
        return this.a.b.isRunning();
    }

    public final void start() {
        Drawable drawable = this.e;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
            return;
        }
        if (!this.a.b.isStarted()) {
            this.a.b.start();
            invalidateSelf();
        }
    }

    public final void stop() {
        Drawable drawable = this.e;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.a.b.end();
        }
    }

    public final /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    public final /* bridge */ /* synthetic */ void setChangingConfigurations(int i) {
        super.setChangingConfigurations(i);
    }

    public final /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    public final /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    public final /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    public final /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    public final /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    public final /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    public final /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    public final /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    public final /* bridge */ /* synthetic */ void setFilterBitmap(boolean z) {
        super.setFilterBitmap(z);
    }

    public final /* bridge */ /* synthetic */ void setHotspotBounds(int i, int i2, int i3, int i4) {
        super.setHotspotBounds(i, i2, i3, i4);
    }

    public final /* bridge */ /* synthetic */ void setHotspot(float f, float f2) {
        super.setHotspot(f, f2);
    }

    public final /* bridge */ /* synthetic */ void setColorFilter(int i, Mode mode) {
        super.setColorFilter(i, mode);
    }
}
