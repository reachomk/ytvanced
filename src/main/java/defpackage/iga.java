package defpackage;

import android.graphics.Point;
import android.view.View;
import com.google.android.apps.youtube.app.common.player.overlay.InlineTimeBar;
import com.google.android.libraries.youtube.player.features.storyboard.ScrubbedPreviewView;
import com.google.android.youtube.R;

/* renamed from: iga */
public final class iga extends aimt {
    private final View a;
    private final InlineTimeBar b;
    private final int c;
    private final int d;
    private final Point e = new Point();

    public iga(ScrubbedPreviewView scrubbedPreviewView, View view, InlineTimeBar inlineTimeBar, aimu aimu) {
        super(scrubbedPreviewView, aimu);
        this.a = view;
        this.b = inlineTimeBar;
        this.c = view.getResources().getDimensionPixelOffset(R.dimen.inline_scrubbed_preview_horizontal_margin);
        this.d = view.getResources().getDimensionPixelOffset(R.dimen.inline_scrubbed_preview_vertical_margin);
    }

    public final void a(ScrubbedPreviewView scrubbedPreviewView) {
        InlineTimeBar inlineTimeBar = this.b;
        Point point = this.e;
        if (point != null) {
            point.set(inlineTimeBar.k, inlineTimeBar.c.top);
        }
        int width = scrubbedPreviewView.getWidth() / 2;
        int i = this.c;
        int width2 = this.a.getWidth();
        int i2 = this.c;
        int i3 = this.e.y;
        int i4 = this.d;
        scrubbedPreviewView.setX((float) (Math.max(i + width, Math.min(this.e.x, (width2 - i2) - width)) - width));
        scrubbedPreviewView.setY((float) ((i3 - i4) - scrubbedPreviewView.getHeight()));
    }
}
