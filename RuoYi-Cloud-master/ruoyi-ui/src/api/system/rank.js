import request from '@/utils/request'

// 查询职级列表
export function listRank(query) {
  return request({
    url: '/system/rank/list',
    method: 'get',
    params: query
  })
}

// 查询职级详细
export function getRank(rankId) {
  return request({
    url: '/system/rank/' + rankId,
    method: 'get'
  })
}

// 新增职级
export function addRank(data) {
  return request({
    url: '/system/rank',
    method: 'post',
    data: data
  })
}

// 修改职级
export function updateRank(data) {
  return request({
    url: '/system/rank',
    method: 'put',
    data: data
  })
}

// 删除职级
export function delRank(rankId) {
  return request({
    url: '/system/rank/' + rankId,
    method: 'delete'
  })
}
