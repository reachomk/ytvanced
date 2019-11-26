package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.view.menu.ListMenuItemView;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;

/* renamed from: aok */
public final class aok extends amt {
    public aoi c;
    private final int d;
    private final int e;
    private MenuItem f;

    public aok(Context context, boolean z) {
        super(context, z);
        if (context.getResources().getConfiguration().getLayoutDirection() == 1) {
            this.d = 21;
            this.e = 22;
            return;
        }
        this.d = 22;
        this.e = 21;
    }

    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null && i == this.d) {
            if (listMenuItemView.isEnabled() && listMenuItemView.a.hasSubMenu()) {
                performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        } else if (listMenuItemView == null || i != this.e) {
            return super.onKeyDown(i, keyEvent);
        } else {
            setSelection(-1);
            ((ait) getAdapter()).a.a(false);
            return true;
        }
    }

    public final boolean onHoverEvent(MotionEvent motionEvent) {
        if (this.c != null) {
            int headersCount;
            ait ait;
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                headersCount = headerViewListAdapter.getHeadersCount();
                ait = (ait) headerViewListAdapter.getWrappedAdapter();
            } else {
                ait = (ait) adapter;
                headersCount = 0;
            }
            MenuItem menuItem = null;
            if (motionEvent.getAction() != 10) {
                int pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
                if (pointToPosition != -1) {
                    pointToPosition -= headersCount;
                    if (pointToPosition >= 0 && pointToPosition < ait.getCount()) {
                        menuItem = (aja) ait.getItem(pointToPosition);
                    }
                }
            }
            MenuItem menuItem2 = this.f;
            if (menuItem2 != menuItem) {
                aiw aiw = ait.a;
                if (menuItem2 != null) {
                    this.c.a(aiw, menuItem2);
                }
                this.f = menuItem;
                if (menuItem != null) {
                    this.c.b(aiw, menuItem);
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    public final /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    public final /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
        super.setSelector(drawable);
    }

    public final /* bridge */ /* synthetic */ boolean hasFocus() {
        return super.hasFocus();
    }

    public final /* bridge */ /* synthetic */ boolean isFocused() {
        return super.isFocused();
    }

    public final /* bridge */ /* synthetic */ boolean hasWindowFocus() {
        return super.hasWindowFocus();
    }

    public final /* bridge */ /* synthetic */ boolean isInTouchMode() {
        return super.isInTouchMode();
    }
}
