const FeedTemplates = (() => {
  class Templates {
    feedListTemplate(feed) {
      const convertTime = (time) => {
        if (time !== null) {
          return time.split('T')[0]
        }
        return time
      }
      return `
      <div class="feed-info" onclick="location.href = '${feed.link}'">
        <div class="feed-description">${feed.feedSourceDto.description}</div>
        <div class="feed-info-title">${feed.title}</div>
        <div class="feed-info-published-date">${convertTime(feed.publishedDate)}</div>
      </div>
      `
    }

    selectedPageBarTemplate(numberOfPage) {
      return `<div class="page-number selected-page" onclick="FeedApp.showFeeds(${numberOfPage})">${numberOfPage}</div>`
    }


    pageBarTemplate(numberOfPage) {
      return `<div class="page-number" onclick="FeedApp.showFeeds(${numberOfPage})">${numberOfPage}</div>`
    }

    nextBarTemplate(numberOfPage) {
      return `<div class="next-bar" onclick="FeedApp.showFeeds(${numberOfPage})">다음</div>`
    }

    prevBarTemplate(numberOfPage) {
      return `<div class="prev-bar" onclick="FeedApp.showFeeds(${numberOfPage})">이전</div>`
    }
  }

  return new Templates()
})()