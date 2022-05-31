package ucc.dto

import lombok.AllArgsConstructor
import lombok.Data
import lombok.NoArgsConstructor


@Data
@AllArgsConstructor
@NoArgsConstructor
class PageDto<T> {
    var pageNumber = 0
    var size = 0
    var numberOfElements = 0
    var totalPages = 0
    var totalSize = 0
    var content: List<T> = ArrayList()
}