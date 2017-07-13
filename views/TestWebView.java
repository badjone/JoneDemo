package newstudiowork.newtest.UI.views;

import android.content.Context;
import android.util.AttributeSet;
import android.webkit.WebView;

/**
 * @author badjone
 * @Date 2016/5/3 13:46
 */
public class TestWebView extends WebView {
    public ScrollInterface mScrollInterface;

    public TestWebView(Context context) {
        super(context);
    }

    public TestWebView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    public TestWebView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onScrollChanged(int l, int t, int oldl, int oldt) {

        super.onScrollChanged(l, t, oldl, oldt);

        mScrollInterface.onSChanged(l, t, oldl, oldt);

    }

    public void setOnCustomScroolChangeListener(ScrollInterface scrollInterface) {

        this.mScrollInterface = scrollInterface;

    }

    public interface ScrollInterface {

        public void onSChanged(int l, int t, int oldl, int oldt);

    }

}
