package org.wikipedia.page;

import android.support.annotation.Nullable;

import org.wikipedia.history.HistoryEntry;
import org.wikipedia.readinglist.page.ReadingListPage;

/**
 * Shared data between PageFragment and PageFragmentLoadState
 */
class PageViewModel {
    @Nullable private Page page;
    @Nullable private PageTitle title;
    @Nullable private PageTitle titleOriginal;
    @Nullable private HistoryEntry curEntry;
    @Nullable private ReadingListPage readingListPage;

    @Nullable public Page getPage() {
        return page;
    }

    public void setPage(@Nullable Page page) {
        this.page = page;
    }

    @Nullable public PageTitle getTitle() {
        return title;
    }

    public void setTitle(@Nullable PageTitle title) {
        this.title = title;
    }

    @Nullable public PageTitle getTitleOriginal() {
        return titleOriginal;
    }

    public void setTitleOriginal(@Nullable PageTitle titleOriginal) {
        this.titleOriginal = titleOriginal;
    }

    @Nullable public HistoryEntry getCurEntry() {
        return curEntry;
    }

    public void setCurEntry(@Nullable HistoryEntry curEntry) {
        this.curEntry = curEntry;
    }

    public boolean isInReadingList() {
        return readingListPage != null;
    }

    public boolean shouldSaveOffline() {
        return readingListPage != null && readingListPage.isOffline();
    }

    public void setReadingListPage(@Nullable ReadingListPage page) {
        readingListPage = page;
    }
}
